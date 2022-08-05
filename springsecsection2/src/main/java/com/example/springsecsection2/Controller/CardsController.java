package com.example.springsecsection2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/myCards")
    public String saveContactInquiryDetails(String input){
        return "Card details from  DB" ;
    }
}
