package com.example.mvploginxample.login.model;

public class DataPostRequest {
    private String username;
    private String password;
    private String tenantcode;
    private String language;
    private String member_token;

    public DataPostRequest(String username, String password, String tenantcode, String language, String member_token) {
        this.username = username;
        this.password = password;
        this.tenantcode = tenantcode;
        this.language = language;
        this.member_token = member_token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTenantcode() {
        return tenantcode;
    }

    public void setTenantcode(String tenantcode) {
        this.tenantcode = tenantcode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMember_token() {
        return member_token;
    }

    public void setMember_token(String member_token) {
        this.member_token = member_token;
    }
}
