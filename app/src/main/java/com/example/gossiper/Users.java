
package com.example.gossiper;

public class Users {

    String profilepic,mail,userName,password,userId,phone,lastMessage,status;

    public  Users(String id, String namee, String emaill, String password, String imageuri, String status){}

    public Users(String userId, String userName, String maill, String password,String phone, String profilepic, String status) {
        this.userId = userId;
        this.userName = userName;
        this.mail = maill;
        this.password = password;
        this.phone=phone;
        this.profilepic = profilepic;
        this.status = status;
    }

    public Users() {
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
