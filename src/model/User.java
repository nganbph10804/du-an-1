/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrator
 */
public class User {
    private String userID,userName, password,name,phone,gender,email,birthDay, address,role;
    private int status;

    public User() {
    }

    public User(String userID, String userName, String password, String name, String phone, String gender, String email, String birthDay, String address, String role, int status) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
        this.birthDay = birthDay;
        this.address = address;
        this.role = role;
        this.status = status;
    }

    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User userID(String userID) {
        this.userID = userID;
        return this;
    }

    public User userName(String userName) {
        this.userName = userName;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User phone(String phone) {
        this.phone = phone;
        return this;
    }

    public User gender(String gender) {
        this.gender = gender;
        return this;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public User birthDay(String birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public User address(String address) {
        this.address = address;
        return this;
    }

    public User role(String role) {
        this.role = role;
        return this;
    }

    public User status(int status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " userID='" + getUserID() + "'" +
            ", userName='" + getUserName() + "'" +
            ", password='" + getPassword() + "'" +
            ", name='" + getName() + "'" +
            ", phone='" + getPhone() + "'" +
            ", gender='" + getGender() + "'" +
            ", email='" + getEmail() + "'" +
            ", birthDay='" + getBirthDay() + "'" +
            ", address='" + getAddress() + "'" +
            ", role='" + getRole() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }

}
