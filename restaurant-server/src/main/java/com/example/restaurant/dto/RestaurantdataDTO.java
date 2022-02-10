package com.example.restaurant.dto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestaurantdataDTO {
	private Integer id;
	private String name;
	private String location;
	private Date openingTime;
	private Date closingTime;
	
	public RestaurantdataDTO(@JsonProperty("name") String restaurantName, @JsonProperty("location") String location, @JsonProperty("otime") String openingTime, @JsonProperty("ctime") String closingTime) throws ParseException {
		this.name = restaurantName;
		this.location = location;
		DateFormat formatter = new SimpleDateFormat("hh:mm");
		this.openingTime = (Date)formatter.parse(openingTime);
		this.closingTime = (Date)formatter.parse(closingTime);
	}
	public RestaurantdataDTO() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getOpeningTime() {
		return openingTime;
	}
	public void setOpeningTime(Date openingTime) {
		this.openingTime = openingTime;
	}
	public Date getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(Date closingTime) {
		this.closingTime = closingTime;
	}
}
