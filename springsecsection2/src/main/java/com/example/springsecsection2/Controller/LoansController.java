package com.example.springsecsection2.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoansController {

    @GetMapping("/myLoans")
    public String getLoanDetails(String input){
        return "loan details from DB" ;
    }
}
