package com.example.springsecsection2.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class CardsController {

    @GetMapping("/myCards")
    public String saveContactInquiryDetails(String input){
        return "Card details from  DB" ;
    }
}
