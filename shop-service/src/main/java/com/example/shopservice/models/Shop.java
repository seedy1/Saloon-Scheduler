package com.example.shopservice.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.Date;

@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop extends AbstractModel{

    private String name;
    private String streetAddress;
    private String city;
    private Date establishedIn;
    private Timestamp openingTime;
    private Timestamp closingTime;

//    @OneToMany
//    private Barber barbers;
}
