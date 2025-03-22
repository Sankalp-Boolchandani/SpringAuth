package com.example.authapp.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path="/register")
public class RegistrationController {

    private RegistrationService registrationService;

    public String regiser(@RequestBody RegistrationRequest registrationRequest){
        return registrationService.register(registrationRequest);
    }

}
