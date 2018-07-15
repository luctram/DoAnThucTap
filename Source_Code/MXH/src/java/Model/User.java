/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author TramLuc
 */
public class User {
    private int userId;
    private String userName;
    private String email;
    private String phone;
    private String password;
    private String name;
    private String otherName;
    private String BDay;
    private String address;
    private String hometown;
    private String describe;
    private String hobby;
    private String listFriendId;
    private String listBlockId;
    private String avatarLink;

    public User(String userName, String email, String phone, String password, String name) {
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.name = name;
    }



    
    
    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getBDay() {
        return BDay;
    }

    public void setBDay(String BDay) {
        this.BDay = BDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getListFriendId() {
        return listFriendId;
    }

    public void setListFriendId(String ListFriendId) {
        this.listFriendId = ListFriendId;
    }

    public String getListBlockId() {
        return listBlockId;
    }

    public void setListBlockId(String ListBlockId) {
        this.listBlockId = ListBlockId;
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
    }

 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

 
    
}
