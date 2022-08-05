package com.example.springsecsection2.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BalanceController {

    @GetMapping("/myBalance")
    public String getBalanceDetails(String input){
        return "Balance details from DB" ;
    }
}
