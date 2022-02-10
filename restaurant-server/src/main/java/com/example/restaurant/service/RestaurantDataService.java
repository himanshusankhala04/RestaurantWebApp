package com.example.restaurant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restaurant.dto.RestaurantdataDTO;
import com.example.restaurant.pojo.Restaurantdata;

@Service
public interface RestaurantDataService {
	public List<Restaurantdata> getRestaurants();
	
	public void addRestaurant(RestaurantdataDTO rd);
}
