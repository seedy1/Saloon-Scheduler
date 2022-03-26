package com.example.appointmentservice.services;

import com.example.appointmentservice.models.Appointment;
import com.example.appointmentservice.objects.Barber;
import com.example.appointmentservice.objects.ResponseTemplateObject;
import com.example.appointmentservice.repos.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService{

    @Autowired
    private AppointmentRepo appointmentRepo;

    @Autowired
    private RestTemplate restTemplate;

    public List<Appointment> getAll(){
        List<Appointment> app  = new ArrayList<>();
        appointmentRepo.findAll().forEach(app::add);

        return app;
    }

    public Appointment newAppointment(Appointment appointment){
        return appointmentRepo.save(appointment);
    }


    public ResponseTemplateObject getAppointmentDetails(Long id){
        ResponseTemplateObject responseTemplateObject = new ResponseTemplateObject();
//        Appointment appointment = appointmentRepo.findById(id);
        Appointment appointment = appointmentRepo.findById(id).get();
        String url = "http://SHOP-SERVICE/barbers/"+ appointment.getBarberID();
        Barber barber = restTemplate.getForObject(url, Barber.class);

        responseTemplateObject.setAppointment(appointment);
        responseTemplateObject.setBerber(barber);

        return responseTemplateObject;

    }

}
