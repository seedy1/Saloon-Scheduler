package com.example.shopservice.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop extends AbstractModel{

    public Shop(String name, String streetAddress, String city, int establishedIn, String openingTime, String closingTime) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.establishedIn = establishedIn;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    @OneToMany(mappedBy = "shop", fetch = FetchType.EAGER)
    private List<Barber> barbes = new LinkedList<>();

    private String name;
    private String streetAddress;
    private String city;
    private int establishedIn;
    private String openingTime;
    private String closingTime;

//    @OneToMany
//    private Barber barbers;
}
