package com.herman87.springbootsecurityclient.entity.listener;

import com.herman87.springbootsecurityclient.entity.User;
import com.herman87.springbootsecurityclient.event.RegistrationCompleteEvent;
import com.herman87.springbootsecurityclient.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {
    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        //create the verification token for the user with link
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        userService.saveVerificationTokenForUser(token, user);

        //send mail to user
        String url = event.getApplicationUrl() + "/verifyRegistration?token="
                + token;

        //send verification email
        log.info("Click the link to verify your account : {}", url);
    }
}
