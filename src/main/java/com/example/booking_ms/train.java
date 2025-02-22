package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class train {
    @GetMapping("/train")
    public String getData() {return  "Please book ticket of train from nagpur to Jammu at 30% discount" ; }
}