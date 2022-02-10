package com.example.restaurant.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurant.dto.MenuitemsDTO;
import com.example.restaurant.pojo.Menuitems;
import com.example.restaurant.repository.MenuitemsRepository;
import com.example.restaurant.service.MenuItemsService;

@Service
public class MenuItemsImplementation implements MenuItemsService{
	
	@Autowired
	MenuitemsRepository mr;

	@Override
	public List<Menuitems> getMenu() {
		return mr.findAll();
		}
	
	@Override
	public void addMenu(MenuitemsDTO midto) {
		Menuitems mi = new Menuitems(midto.getItemName(),midto.getPrice());
		mr.save(mi);
		
	}
	
	
	

}
