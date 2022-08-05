package com.example.springsecsection2.Controller;

import org.springframework.web.bind.annotation.GetMapping;


public class ContactController {
    @GetMapping("/contact")
    public String saveContactInquiryDetails(String input){
        return "Inquiry details saved to DB" ;
    }

}
