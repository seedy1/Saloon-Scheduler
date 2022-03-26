package com.example.shopservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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


    @ManyToOne
    @JoinColumn(name= "shop_id")
    @JsonIgnore
    private Shop shop;
}
