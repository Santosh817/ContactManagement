package com.signify.ContactManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {

    public UserEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    private String username;

    public UserEntity(long userId, String username, String usernumber, String usermail) {
        this.userId = userId;
        this.username = username;
        this.usernumber = usernumber;
        this.usermail = usermail;
    }

    private String usernumber;
    private String usermail;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long user_id) {
        this.userId = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber;
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }


}
