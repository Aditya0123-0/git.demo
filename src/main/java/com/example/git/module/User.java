package com.example.git.module;

public class User {
    private  int userId;
    private String userName;
    private String userPassword;

    public void setUserId(int userId){
        this.userId=userId;
    }
    public int getUserId(){
        return  userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
