package com.example.gatewayservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController{

    @GetMapping("/shopServiceFallBack")
    public String shopServiceFallBackMethod(){
        return "Shop is down... Try again later";
    }

    @GetMapping("/appointmentServiceFallBack")
    public String appointmentServiceFallBackMethod(){
        return "Appointment system is currently down... Try again later";
    }
}
