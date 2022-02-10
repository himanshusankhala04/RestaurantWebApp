package com.example.restaurant.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.dto.RestaurantdataDTO;
import com.example.restaurant.serviceimplementation.RestaurantDataImplementation;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	RestaurantDataImplementation service;
	
	@Autowired
	ModelMapper modelMapper;
	
	@GetMapping("/restaurantdata")
	public List<RestaurantdataDTO> getRestaurants(){
		List<RestaurantdataDTO> rdt = modelMapper.map(service.getRestaurants(),new TypeToken<List<RestaurantdataDTO>>() {}.getType());
		return rdt;
	}
	
	@PostMapping("/addrestaurant")
	public void addRestaurant(@RequestBody RestaurantdataDTO rdt) {
		service.addRestaurant(rdt);
	}
}
