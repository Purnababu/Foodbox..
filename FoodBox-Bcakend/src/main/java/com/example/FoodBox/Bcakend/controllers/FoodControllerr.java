package com.example.FoodBox.Bcakend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodBox.Bcakend.model.FOODitems;
import com.example.FoodBox.Bcakend.repo.foodrepo;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200/")
public class FoodControllerr {
      @Autowired
	foodrepo fdr;

	   @GetMapping("/items")
	      public List<FOODitems> getlist() {
		  return fdr.findAll();
	   }

	   
}
