package com.petstore.core;

import com.petstore.enums.PetEnums;

public class Pet {
	private static int count;
	private int petID;
	private String name;
	private PetEnums cat;
	private double unitPrice;
	private int stocks;
	static {
		count=1;
	}
	public Pet() {
		
	}
	
	public Pet(int petId) {
		this.petID=petId;
		
	}
	
	public Pet(String name, PetEnums cat, double unitPrice, int stocks) {
		super();
		this.petID=count++;
		this.name = name;
		this.cat = cat;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}
	public int getPetID() {
		return petID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PetEnums getCat() {
		return cat;
	}
	public void setCat(PetEnums cat) {
		this.cat = cat;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getStocks() {
		return stocks;
	}
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return "Pet [petID= " + petID + ", Petname= " + name + ", category= " + cat + ", unitPrice= " + unitPrice + ", stocks= "
				+ stocks + "]";
	}
	
	

}
