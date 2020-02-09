package com.example.mvploginxample.login.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvploginxample.R;
import com.example.mvploginxample.login.KEY;
import com.example.mvploginxample.login.model.User;
import com.example.mvploginxample.login.presenter.ILoginPresenter;
import com.example.mvploginxample.login.presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements ILoginPresenter {

    private EditText edtUserId;
    private EditText edtUserName;
    private EditText edtUserPass;
    private TextView btnForgotPass;
    private Button btnLogin;

    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        init();
        event();
    }

    private void initView() {
        edtUserId = findViewById(R.id.edtUserId);
        edtUserName = findViewById(R.id.edtUserName);
        edtUserPass = findViewById(R.id.edtUserPass);
        btnForgotPass = findViewById(R.id.btnForgotPass);
        btnLogin = findViewById(R.id.btnLogin);
    }

    private void init() {
        mLoginPresenter = new LoginPresenter(this); //this = activity_main
    }

    private void event() {

        btnForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginPresenter.checkEdtData(edtUserId.getText().toString(), edtUserName.getText().toString(), edtUserPass.getText().toString());
            }
        });
    }

    @Override
    public void onLoginSuccess( User user) {
        //ko ai cho m viết text trong đây, thông báo cho hết vào string.xml ko lao m sửa sml
        Toast.makeText(this, getString(R.string.login_success), Toast.LENGTH_SHORT).show();
        Bundle bundle = new Bundle();
        Intent intent = new Intent(MainActivity.this, LoginSuccessActivity.class);
        bundle.putSerializable(KEY.USER, user);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    public void onLoginFail(String messageFail) {
        Toast.makeText(this, messageFail, Toast.LENGTH_SHORT).show();
    }

}
