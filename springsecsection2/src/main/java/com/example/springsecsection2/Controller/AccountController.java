package com.example.springsecsection2.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AccountController {

    @GetMapping("/myAccount")
    public String getAccountDetails(String input){
        return "Account details from DB" ;
    }
}
