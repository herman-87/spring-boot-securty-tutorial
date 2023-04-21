package com.herman87.springbootsecurityclient.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@Getter
@Setter
@NoArgumentConstructor
@AllArgumentConstructor
public class UserModel {
    private String firstName;
    private String lastname;
    private String email;
    private String password;
    private String macthingPassword;
}
