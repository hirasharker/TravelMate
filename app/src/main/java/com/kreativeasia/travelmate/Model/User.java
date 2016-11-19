package com.kreativeasia.travelmate.Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Timestamp;


/**
 * Created by hira on 11/19/2016.
 */

public class User {
    private int userId;
    private String fullName;
    private String userName;
    private String password;
    private String emergencyContact;
    private String address;
    private String userPhotoPath;
    private Timestamp creationTime;

    public User() {
        this.creationTime=this.setCreationTime();
    }

    public User(int userId, String fullName, String userName, String password, String emergencyContact, String address, String userPhotoPath) {
        this.userId = userId;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.emergencyContact = emergencyContact;
        this.address = address;
        this.userPhotoPath = userPhotoPath;
        this.creationTime = this.setCreationTime();
    }

    public User(String fullName, String userName, String password, String emergencyContact, String address, String userPhotoPath) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.emergencyContact = emergencyContact;
        this.address = address;
        this.userPhotoPath = userPhotoPath;
        this.creationTime = this.setCreationTime();
    }

    public int getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public String getAddress() {
        return address;
    }

    public String getUserPhotoPath() {
        return userPhotoPath;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    private Timestamp setCreationTime() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return this.creationTime = Timestamp.valueOf(simpleDateFormat.format(date));
    }
}
