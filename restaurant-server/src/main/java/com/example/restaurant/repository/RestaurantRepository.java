package com.example.restaurant.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurant.pojo.Restaurantdata;

public interface RestaurantRepository extends JpaRepository<Restaurantdata,Integer> {

	
}
