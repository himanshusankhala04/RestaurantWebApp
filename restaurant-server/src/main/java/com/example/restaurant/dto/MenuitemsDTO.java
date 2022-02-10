package com.example.restaurant.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuitemsDTO {
	private Integer id;
	private String itemName;
	private Integer price;
	
	public MenuitemsDTO(@JsonProperty("itemName") String itemName,@JsonProperty("price") Integer price) {
		this.itemName = itemName;
		this.price = price;
	}
	
	public MenuitemsDTO() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
