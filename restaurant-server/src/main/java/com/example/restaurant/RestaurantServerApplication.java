package com.example.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.hibernate.collection.spi.PersistentCollection;
import org.modelmapper.ModelMapper;

@SpringBootApplication
public class RestaurantServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantServerApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {


		ModelMapper modelMapper = new ModelMapper();



	    modelMapper.getConfiguration()
	            .setPropertyCondition(context -> (!(context.getSource() instanceof PersistentCollection)));
	    return modelMapper;
	}	
	
}




