package com.example.FoodBox.Bcakend.model;

import org.hibernate.annotations.DialectOverride.GeneratedColumns;

import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedColumns
	
	private String uname;
	private int icinid;
	private String passworad;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getIcinid() {
		return icinid;
	}
	public void setIcinid(int icinid) {
		this.icinid = icinid;
	}
	public String getPassworad() {
		return passworad;
	}
	public void setPassworad(String passworad) {
		this.passworad = passworad;
	}
	public User(String uname, int icinid, String passworad) {
		super();
		this.uname = uname;
		this.icinid = icinid;
		this.passworad = passworad;
	}
	

}
