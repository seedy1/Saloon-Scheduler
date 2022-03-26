package com.example.appointmentservice.controllers;

import com.example.appointmentservice.models.Appointment;
import com.example.appointmentservice.objects.ResponseTemplateObject;
import com.example.appointmentservice.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController{

    @Autowired
    private AppointmentService appointmentService;


    @GetMapping("/")
    public List<Appointment> listAll(){
        return appointmentService.getAll();
    }

    @PostMapping("/")
    public Appointment saveApo(@RequestBody Appointment appointment){
        return appointmentService.newAppointment(appointment);
    }

    // appointment 'id' would be a key like a post identifier for users to see status of their appointment
    @GetMapping("/{id}")
    public ResponseTemplateObject getAppointmentAndBarberInfo( @PathVariable("id") Long id){
        return appointmentService.getAppointmentDetails(id);
    }

}
