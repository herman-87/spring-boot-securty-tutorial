package com.herman87.springbootsecurityclient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "t_user")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private Long id;
    @Column(name = "c_firstname")
    private String firstName;
    @Column(name = "c_lastname")
    private String lastName;
    @Column(name = "c_email")
    private String email;
    @Column(name = "c_password", length = 60)
    private String password;
    private String role;
    private boolean enabled = false;
}
