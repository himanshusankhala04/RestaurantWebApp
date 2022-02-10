package com.example.restaurant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restaurant.dto.MenuitemsDTO;
import com.example.restaurant.pojo.Menuitems;

@Service
public interface MenuItemsService {
	public List<Menuitems> getMenu();
	
	public void addMenu(MenuitemsDTO mi);
}
