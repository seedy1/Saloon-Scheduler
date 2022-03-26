package com.example.shopservice.repos;

import com.example.shopservice.models.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class ShopDataLoader implements CommandLineRunner {

    @Autowired
    private ShopRepo shopRepo;

    @Override
    public void run(String... args) throws Exception {
        seedShops();
    }

    private void seedShops(){
        if(shopRepo.count() == 0){ // runs only during the first time to seed the DB

            Shop shop1 = new Shop("Barber Shop Name", "144 Av", "New York", 2012, "7 AM", "9 PM");
            Shop shop2 = new Shop("The Barber Shop", "12 Av NW", "New York", 2010, "9 AM", "11 PM");
            Shop shop3 = new Shop("Cheap Cuts", "Wake street", "Manhattan", 2011, "8 AM", "5 PM");

//            shopRepo.saveAll(shop1, shop2, shop3);
            shopRepo.save(shop1);
            shopRepo.save(shop2);
            shopRepo.save(shop3);

        }

        System.out.println("SEED COUNT: "+shopRepo.count());
    }
}
