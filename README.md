# Saloon-Scheduler
The app is to have an appointment maker to schedule haircuts with barbers. This backend API can be extended to both an mobile application and web.

- java version 11
- spring version 2.6.3
- maven -- yes

## Services

## 1. Shop/barber Service
>This service contains the barbers and barber shops and models for adding them.
## 2. Appointment Service
>This service allows users to make an appointment with a particular barber.

## 3. Discovery
>This provides the service disvovery for the application.

## 4. API Gateway Service
>this provides a centralized access point for the application.

## Hystri
>This provides a dashboard to monitor all request being made with failure and success rates. Here is also where we have the fall back methods incase a microservice is completely not working.

## how to setup and run the application
Recommended IDE is in IntelliJ.

### 1. Make sure your computer has java 11 

### 2. open all the applications as different projects

### 3. Setup mySql by creating two databases, one for shop-service and the other for appointment-service

### 4. Open the application.yaml files for shop-service and appointment-service and change the follwoing configurations
spring:
  application:
    name: appointment-service
  datasource:
    url: `chnage`
    username: `chnage`
    password: `chnage`
    driver-class-name: com.mysql.cj.jdbc.Driver


## How to run the API

import the poostman collection `Saloon-Scheduler\clould.postman_collection.json`, this has all the endpoints you need to run and test the application.

Examples of post request below

`{
    "firstName": "name",
    "secondName": "second",
    "email": "ba@w.fr",
    "phoneNumber": "01 02 02 78 78"
}`

`{
    "firstName": "first",
    "secondName": "customer",
    "phoneNumber": "668",
    "email": "me@me.com",
    "note": "this is a note",
    "appointmentDate": "2022-03-27",
    "barberID": 1
}`

