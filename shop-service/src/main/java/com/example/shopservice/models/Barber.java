package com.example.shopservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Barber extends AbstractModel{

    // TODO: belongs to user: one to one relationship

    private String firstName;
    private String secondName;

    private String email;
    private String phoneNumber;
//    private List<String, List<String>, Boolean> schedule;
//    private ArrayList<Date> schedule;

   //    @ElementCollection private HashMap<Date, Boolean> schedule; create available

    @ManyToOne
    @JoinColumn(name= "shop_id")
    private Shop shop;
}
