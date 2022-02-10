package com.example.restaurant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restaurant.dto.UserdataDTO;
import com.example.restaurant.pojo.Userdata;

@Service
public interface LoginService {
	public Userdata logguserIn(String email, String Password);
	
	public int registerUser(UserdataDTO ud);
	
	public List<Userdata> getAll();
	
	public void resetPassword(UserdataDTO ud);
	
	public void deleteAccount(String email);
	
}
