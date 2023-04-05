package com.example.FoodBox.Bcakend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FOODitems {
	
	
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String FoodName;
	private int Prize;
	public FOODitems(int id, String foodName, int prize) {
		super();
		this.id = id;
		FoodName = foodName;
		Prize = prize;
	}
	public FOODitems() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public int getPrize() {
		return Prize;
	}
	public void setPrize(int prize) {
		Prize = prize;
	}

	
	
	
	
	
	
	
	
}
