package com.signify.ContactManagement.services;

import com.signify.ContactManagement.entity.UserEntity;
import com.signify.ContactManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserdataWorkstation implements UserdataServices{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity saveuserdata(UserEntity userentity) {
        return userRepository.save(userentity);
    }

    @Override
    public UserEntity getUserId(Long userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public void deleteUserbyId(Long userId) {
        userRepository.deleteById(userId);
    }


    @Override
    public UserEntity updateUserbyId(Long userId, UserEntity userEntity) {
        UserEntity userDB = userRepository.findById(userId).get();

        if(Objects.nonNull(userEntity.getUsername()) && !"".equalsIgnoreCase(userEntity.getUsername()))
        {
            userDB.setUsername(userEntity.getUsername());
        }

        if(Objects.nonNull(userEntity.getUsernumber()) && !"".equalsIgnoreCase(userEntity.getUsernumber()))
        {
            userDB.setUsernumber(userEntity.getUsernumber());
        }

        if(Objects.nonNull(userEntity.getUsermail()) && !"".equalsIgnoreCase(userEntity.getUsermail()))
        {
            userDB.setUsermail(userEntity.getUsermail());
        }

        return userRepository.save(userDB);
    }
}
