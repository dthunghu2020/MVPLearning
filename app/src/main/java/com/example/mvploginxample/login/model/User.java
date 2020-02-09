package com.example.mvploginxample.login.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class User  implements Serializable{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("tel")
    @Expose
    private Object tel;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("picture")
    @Expose
    private String picture;
    @SerializedName("joined")
    @Expose
    private String joined;
    @SerializedName("designation")
    @Expose
    private Object designation;
    @SerializedName("roles")
    @Expose
    private List<Object> roles = null;
    @SerializedName("permissions")
    @Expose
    private List<Object> permissions = null;
    @SerializedName("branches")
    @Expose
    private List<Object> branches = null;
    @SerializedName("isAdmin")
    @Expose
    private Boolean isAdmin;
    @SerializedName("isSupperUser")
    @Expose
    private Boolean isSupperUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getTel() {
        return tel;
    }

    public void setTel(Object tel) {
        this.tel = tel;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }

    public Object getDesignation() {
        return designation;
    }

    public void setDesignation(Object designation) {
        this.designation = designation;
    }

    public List<Object> getRoles() {
        return roles;
    }

    public void setRoles(List<Object> roles) {
        this.roles = roles;
    }

    public List<Object> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Object> permissions) {
        this.permissions = permissions;
    }

    public List<Object> getBranches() {
        return branches;
    }

    public void setBranches(List<Object> branches) {
        this.branches = branches;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getIsSupperUser() {
        return isSupperUser;
    }

    public void setIsSupperUser(Boolean isSupperUser) {
        this.isSupperUser = isSupperUser;
    }

}
