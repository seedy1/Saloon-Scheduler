package com.example.appointmentservice.repos;

import com.example.appointmentservice.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment, Long>{}
