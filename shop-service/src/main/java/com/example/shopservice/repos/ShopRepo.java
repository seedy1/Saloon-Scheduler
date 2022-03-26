package com.example.shopservice.repos;

import com.example.shopservice.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepo extends JpaRepository<Shop, Long>{

//    Shop findByShopId(Long id);

}

