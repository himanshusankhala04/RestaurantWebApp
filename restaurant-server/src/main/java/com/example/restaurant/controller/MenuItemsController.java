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

import com.example.restaurant.dto.MenuitemsDTO;
import com.example.restaurant.serviceimplementation.MenuItemsImplementation;

@RestController
@RequestMapping("/restaurant")
public class MenuItemsController {
	@Autowired
	MenuItemsImplementation service;

	@Autowired
	ModelMapper modelMapper;
	
	@GetMapping("/menuitems")
	public List<MenuitemsDTO> getMenu() {
		List<MenuitemsDTO> mdt = modelMapper.map(service.getMenu(), new TypeToken<List<MenuitemsDTO>>() {}.getType());
		return mdt;
	}
	
	@PostMapping("/addmenuitem")
	public void addMenu(@RequestBody MenuitemsDTO mi) {
		service.addMenu(mi);
	}
	
}
