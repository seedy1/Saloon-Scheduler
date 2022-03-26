package com.example.shopservice.controllers;

import com.example.shopservice.models.Barber;
import com.example.shopservice.models.Shop;
import com.example.shopservice.services.BarberService;
import com.example.shopservice.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/")
public class BarberController{

    @Autowired
    private BarberService barberService;

    @Autowired
    private ShopService shopService;

    @GetMapping("/barbers")
    public List<Barber> listAll(){
        return barberService.getAll();
    }

    // add a new barber to a shop
    @PostMapping("/shops/{id}/barbers")
    public Barber save(@PathVariable("id") Long id, @RequestBody Barber barber){
        Shop currentShop = shopService.findById(id);
        barber.setShop(currentShop);
        return barberService.saveNewBarber(barber);
    }

}
