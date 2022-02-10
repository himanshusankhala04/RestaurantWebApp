package com.example.restaurant.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurant.dto.UserdataDTO;
import com.example.restaurant.pojo.Userdata;
import com.example.restaurant.repository.UserdataRepository;
import com.example.restaurant.service.*;

@Service
public class loginImplementation implements LoginService{
	@Autowired
	UserdataRepository ur;
	UserdataDTO udto;
	
	
	
	@Override
	public Userdata logguserIn(String email, String password) {
		Optional<Userdata> op = ur.findById(email);
		
		if (!op.isEmpty()) {
			
			Userdata ud = op.get();
			if (ud.getUpassword().equals(password)) {
				
				
				return ud;
			}
		}
		return null;
		
		
	}

	@Override
	public int registerUser(UserdataDTO udt) {
		
		Userdata ud = new Userdata(udt.getEmailid(), udt.getUname(), udt.getUpassword());
		ud.setToken(1);
		ur.save(ud);
		return 1;
	}


	@Override
	public List<Userdata> getAll() {
		List<Userdata> udl = ur.findAll();
		
		return udl;
	}

	@Override
	public void resetPassword(UserdataDTO udt) {
		Userdata ud = ur.getById(udt.getEmailid());
		ud.setUpassword(udt.getUpassword());
		ur.save(ud);
	}

	@Override
	public void deleteAccount(String email) {
		Userdata ud = ur.getById(email);
		ud.setToken(0);
		ur.save(ud);
		
	}
	
}
