package com.example.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurant.pojo.Userdata;

public interface UserdataRepository extends JpaRepository<Userdata,String> {


}
