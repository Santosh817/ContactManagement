package com.signify.ContactManagement.controller;

import com.signify.ContactManagement.entity.UserEntity;
import com.signify.ContactManagement.services.UserdataServices;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserdataServices userdataservices;

    @PostMapping("/api/v1/users")
    public UserEntity savinguser(@RequestBody UserEntity userentity)
    {
        return userdataservices.saveuserdata(userentity);
    }

    @GetMapping("/api/v1/users")
    public List<UserEntity> getAllusers(){
        return UserdataServices.getAllusers();
    }

    @GetMapping("/api/v1/users/{id}")
    public UserEntity getuserById(@PathVariable("id") Long userId)
    {
        return userdataservices.getUserId(userId);
    }

    @PutMapping("/api/v1/users/{id}")
    public UserEntity updateUserbyId(@PathVariable("id") Long userId, UserEntity userEntity)
    {
        return userdataservices.updateUserbyId(userId, userEntity);
    }

    @DeleteMapping("/api/v1/users/{id}")
    public String deleteuser(@PathVariable("id") Long userId)
    {
        userdataservices.deleteUserbyId(userId);
        return "User deleted Successfully";
    }

}
