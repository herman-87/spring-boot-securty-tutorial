package com.herman87.springbootsecurityclient.service;

import com.herman87.springbootsecurityclient.entity.User;
import com.herman87.springbootsecurityclient.model.UserModel;
import com.herman87.springbootsecurityclient.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User registerUser(UserModel userModel) {
        User user = new User();
        user.setEmail(userModel.getEmail());
        user.setFirstName(userModel.getFirstName());
        user.setFirstName(userModel.getLastName);
        user.setRole("USER");
        user.setPassword(userModel.getPassword());
        return null;
    }
}
