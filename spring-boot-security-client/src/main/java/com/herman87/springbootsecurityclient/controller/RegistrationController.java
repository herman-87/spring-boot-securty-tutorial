package com.herman87.springbootsecurityclient.controller;

import com.herman87.springbootsecurityclient.entity.User;
import com.herman87.springbootsecurityclient.model.UserModel;
import com.herman87.springbootsecurityclient.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private UserService userService;

    @PostMapping("/register-user")
    public String registerUser(@RequestBody UserModel userModel) {
        User user = userService.registerUser(userModel);
    }
}
