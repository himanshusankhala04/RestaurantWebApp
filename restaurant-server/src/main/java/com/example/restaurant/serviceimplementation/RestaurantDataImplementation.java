package com.example.restaurant.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurant.dto.RestaurantdataDTO;
import com.example.restaurant.pojo.Restaurantdata;
import com.example.restaurant.repository.RestaurantRepository;
import com.example.restaurant.service.RestaurantDataService;

@Service
public class RestaurantDataImplementation implements RestaurantDataService{
	
	@Autowired
	RestaurantRepository rr;
	
	
	@Override
	public List<Restaurantdata> getRestaurants(){
		return rr.findAll();
	}

	@Override
	public void addRestaurant(RestaurantdataDTO rdt) {
		Restaurantdata rd = new Restaurantdata(rdt.getName(), rdt.getLocation(), rdt.getOpeningTime(), rdt.getClosingTime());
		
		 
		rr.save(rd);	
		
	}

}
	
