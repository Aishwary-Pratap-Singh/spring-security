package com.example.springsecsection2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @GetMapping("/notices")
    public String getNotices(String input){
        return "Notices from DB";
    }

}
