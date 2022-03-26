package com.example.shopservice.controllers;

import com.example.shopservice.models.Shop;
import com.example.shopservice.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    private ShopService shopService;


    @GetMapping("/")
    public List<Shop> listAll(){
        return shopService.getAll();
    }

    @GetMapping("/{id}")
    public Shop findById(@PathVariable("id") Long id){
        return shopService.findById(id);
    }

}
