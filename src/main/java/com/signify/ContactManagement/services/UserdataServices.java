package com.signify.ContactManagement.services;

import com.signify.ContactManagement.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserdataServices {
    static List<UserEntity> getAllusers() {
        return null;
    }

    UserEntity saveuserdata(UserEntity userentity);

    UserEntity getUserId(Long userId);

    void deleteUserbyId(Long userId);

    UserEntity updateUserbyId(Long userId, UserEntity userEntity);
}
