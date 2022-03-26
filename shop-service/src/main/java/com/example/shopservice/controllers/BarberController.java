package com.example.shopservice.controllers;

import com.example.shopservice.models.Barber;
import com.example.shopservice.services.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/barbers")
public class BarberController{

    @Autowired
    private BarberService barberService;

    @GetMapping("/")
    public List<Barber> listAll(){
        return barberService.getAll();
    }

    @PostMapping("/")
    public Barber save(@RequestBody Barber barber){
        return barberService.saveNewBarber(barber);
    }

}
