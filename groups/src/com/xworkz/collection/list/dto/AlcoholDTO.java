package com.xworkz.collection.list.dto;

import java.io.Serializable;

import com.xworkz.collection.dto.constants.AlcoholType;

public class AlcoholDTO implements Serializable, Comparable<AlcoholDTO> {

	private String brand;
	private int price;
	private boolean scotch;
	private double quantity;
	private AlcoholType type;

	public AlcoholDTO() {
		System.out.println("invoked default constructor from alcoholDTO");
	}

	public AlcoholDTO(String brand, int price, boolean scotch, double quantity, AlcoholType type) {
		super();
		this.brand = brand;
		this.price = price;
		this.scotch = scotch;
		this.quantity = quantity;
		this.type = type;
	}

	@Override
	public int compareTo(AlcoholDTO ref) {

		return this.brand.compareTo(ref.getBrand());
		
		/*String otherValue = ref.getBrand();
		if (this.brand.compareTo(otherValue) == 0)
			return 0;
		if (this.brand.compareTo(otherValue) > 0)
			return 1;
		if (this.brand.compareTo(otherValue) < 0)
			return -1;
		return 0;*/
	}

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", price=" + price + ", scotch=" + scotch + ", quantity=" + quantity
				+ ", type=" + type + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isScotch() {
		return scotch;
	}

	public void setScotch(boolean scotch) {
		this.scotch = scotch;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public AlcoholType getType() {
		return type;
	}

	public void setType(AlcoholType type) {
		this.type = type;
	}
}
