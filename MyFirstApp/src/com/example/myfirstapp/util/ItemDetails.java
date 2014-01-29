package com.example.myfirstapp.util;

public class ItemDetails {
	private String name ;
	private String email;
	private String added;
	private String updated;
	private int imageNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdded() {
		return added;
	}
	public void setAdded(String price) {
		this.added = price;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String itemDescription) {
		this.email = itemDescription;
	}
	public int getImageNumber() {
		return imageNumber;
	}
	public void setImageNumber(int imageNumber) {
		this.imageNumber = imageNumber;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
}
