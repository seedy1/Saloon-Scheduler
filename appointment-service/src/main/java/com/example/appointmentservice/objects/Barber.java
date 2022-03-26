package com.example.appointmentservice.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Barber{

    private Long id;
    private String firstName;
    private String secondName;
    private String email;
    private String phoneNumber;
}
