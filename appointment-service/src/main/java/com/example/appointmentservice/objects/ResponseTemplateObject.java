package com.example.appointmentservice.objects;

import com.example.appointmentservice.models.Appointment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateObject{
    private Barber berber;
    private Appointment appointment;
}
