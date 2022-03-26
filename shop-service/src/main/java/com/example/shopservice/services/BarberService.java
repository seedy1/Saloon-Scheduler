package com.example.shopservice.services;

import com.example.shopservice.models.Barber;
import com.example.shopservice.repos.BarberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BarberService{

    @Autowired
    private BarberRepo barberRepo;

    public List<Barber> getAll(){
        List<Barber> barbers = new ArrayList<>();
        barberRepo.findAll().forEach(barbers::add);

        return barbers;
    }

    public Barber saveNewBarber(Barber barber){
        return barberRepo.save(barber);
    }

}
