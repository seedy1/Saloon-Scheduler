package com.example.shopservice.repos;

import com.example.shopservice.models.Barber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarberRepo extends JpaRepository<Barber, Long>{}
