package com.inexture.apigateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    @RequestMapping("/fallbackUserService")
    public String fallbackUserService(){
        return "User service is down!";
    }

    @RequestMapping("/fallbackAddressService")
    public String fallbackAddressService(){
        return "Address service is down!";
    }
}
