package com.example.shopservice.services;

import com.example.shopservice.models.Shop;
import com.example.shopservice.repos.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopRepo shopRepo;

    public List<Shop> getAll(){
//        List<Shop> barberShops = new ArrayList<>();
//        shopRepo.findAll().forEach(barberShops::add);

//        return barberShops;
        return  shopRepo.findAll();
    }

    public Shop findById(Long id){

//        Shop shop = new Shop();
        return shopRepo.findById(id).get();

    }

}
