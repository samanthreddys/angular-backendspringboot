package com.colorpix.rest.webservices.restfulwebservices.helloworld;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class SampleController {

    @GetMapping(path = "/hellobean")
    public HelloWorldBean HelloWorldBean(String messsage) throws RuntimeException {
       return new HelloWorldBean("Hello Welcome to ColorPix Data Services!");
       // throw new RuntimeException("Error happend while responding");

    }
    @GetMapping(path = "/hellobean/{name}")
    public HelloWorldBean HelloWorldBeanPathVariable(@PathVariable String name) throws RuntimeException {
        return new HelloWorldBean(String.format("Hello %s, Welcome to ColorPix Data Services!",name));
        // throw new RuntimeException("Error happend while responding");

    }

}
