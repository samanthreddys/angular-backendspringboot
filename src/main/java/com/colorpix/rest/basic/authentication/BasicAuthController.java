package com.colorpix.rest.basic.authentication;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BasicAuthController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean authenticationBean() throws RuntimeException {
       return new AuthenticationBean("Hello, you are authenticated!");
       // throw new RuntimeException("Error happend while responding");

    }


}
