package com.example.restaurant.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurant.pojo.Menuitems;


public interface MenuitemsRepository extends JpaRepository<Menuitems,Integer> {

}
