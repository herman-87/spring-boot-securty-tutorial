package com.herman87.springbootsecurityclient.service;

import com.herman87.springbootsecurityclient.entity.User;
import com.herman87.springbootsecurityclient.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);

    String validateVerificationToken(String token);
}
