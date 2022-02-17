package com.example.shopservice.models;

import lombok.Data;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Entity
@Data
public class Barber extends AbstractModel{

    // TODO: belongs to user: one to one relationship

    private String firstName;
    private String secondName;
    private String email;
    private String phoneNumber;
//    private List<String, List<String>, Boolean> schedule;
//    private ArrayList<Date> schedule;
    @ElementCollection
    private HashMap<Date, Boolean> schedule; // create available

    @ManyToOne
    private Shop shop;
}
