package com.example.mvploginxample.login.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.mvploginxample.R;
import com.example.mvploginxample.login.KEY;
import com.example.mvploginxample.login.model.User;

public class LoginSuccessActivity extends AppCompatActivity {

    ImageView imgUser;
    TextView txtLSUserName;
    TextView txtLSUserFirstName;
    TextView txtLSUserLastName;
    TextView txtLSUserEmail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);
        initview();
        event();
    }

    private void initview() {
        imgUser = findViewById(R.id.imgUser);
        txtLSUserName = findViewById(R.id.txtLSUserName);
        txtLSUserFirstName = findViewById(R.id.txtLSUserFirstName);
        txtLSUserLastName = findViewById(R.id.txtLSUserLastName);
        txtLSUserEmail = findViewById(R.id.txtLSUserEmail);
    }

    private void event() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle == null) return;
        User user = (User) bundle.getSerializable(KEY.USER);
        assert user != null;

        Glide.with(this)
                .load(user.getPicture())
                .into(imgUser);
        txtLSUserName.setText(user.getUsername());
        txtLSUserFirstName.setText(user.getFirstname());
        txtLSUserLastName.setText(user.getLastname());
        txtLSUserEmail.setText(user.getEmail());
    }
}
