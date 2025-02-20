package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holidays {
    @GetMapping("/holidays")
    public String getData() {return  "Please book your holidays ticket for New Delhi 50% discount" ; }
}