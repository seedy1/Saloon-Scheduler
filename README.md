# Saloon-Scheduler

The app is to simply have a Scheduler system for a barber shop or hair dresser.

## Services

1. Shop/barber Service - barber models and shop models and information. Shop model- name, address, city, image, opening
   hours, closing hours, barber count?: One shop vs many shops Shops will be seeded

Barbers(opening times and dates to make Schedules) - name, contact details, belongs to shop, profile picture Barbers
where they can post there own Schedules and shops they work in barbers need to register

2. Appointment/Booking Service - no registration needed for customers (just provide contact details)
   shop and barber ID, time and date from barbers availability, pending or confirmed or cancelled

3. Notification Services - maybe use Kafka idk

4. Search Service


- repo to contain all micro services
- java version 11
- spring version 2.6.3
- maven -- yes
