package com.example.springsecsection2.Controller;

import org.springframework.web.bind.annotation.GetMapping;


public class NoticesController {
    @GetMapping("/notices")
    public String getNotices(String input){
        return "Notices from DB";
    }

}
