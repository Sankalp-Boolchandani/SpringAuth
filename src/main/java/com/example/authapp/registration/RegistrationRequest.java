package com.example.authapp.registration;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RegistrationRequest {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

}
