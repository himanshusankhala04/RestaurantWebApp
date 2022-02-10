package com.example.restaurant.controller;


import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.dto.UserdataDTO;
import com.example.restaurant.pojo.Userdata;
import com.example.restaurant.serviceimplementation.loginImplementation;

@RestController
@RequestMapping("/restaurant")
public class LogInController {
	@Autowired
	loginImplementation service;
	
	@Autowired
	ModelMapper modelMapper;
	
	@PostMapping("/login")
	public UserdataDTO logginUser(@RequestBody UserdataDTO ud) {
		
		Userdata u = service.logguserIn(ud.getEmailid(), ud.getUpassword());
		if (u == null) {
			return null;
		}
		UserdataDTO udto = modelMapper.map(u, UserdataDTO.class);
		
		return udto;
	}
	
	@PostMapping(value="/register")
	public int registerUser(@RequestBody UserdataDTO ud) {
		
		return service.registerUser(ud);
	}
	
	@GetMapping("/allusers")
	public List<UserdataDTO> getAll(){
		List<Userdata> udl = service.getAll();
		
		List<UserdataDTO> udtol = modelMapper.map(udl,new TypeToken<List<UserdataDTO>>() {}.getType());
		return udtol;
	}
	
	@PutMapping("/resetpassword")
	public void resetPassword(@RequestBody UserdataDTO ud) {
		service.resetPassword(ud);
	}
	
	@DeleteMapping("/deleteaccount/{email}")
	public void deleteAccount(@PathVariable String email) {
		service.deleteAccount(email);
	}

}
