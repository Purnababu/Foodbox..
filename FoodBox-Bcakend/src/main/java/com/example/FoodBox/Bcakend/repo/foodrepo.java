package com.example.FoodBox.Bcakend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FoodBox.Bcakend.model.FOODitems;
@Repository
public interface foodrepo  extends JpaRepository<FOODitems,Integer>{

}
