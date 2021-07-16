package com.xworkz.collection.list.dto;

import java.io.Serializable;

public class PerfumeDTO implements Serializable {
	private String brand;
	private Double price;
	private boolean fragrance;
	private Double weight;

	public PerfumeDTO() {
		System.out.println("invoked default constructor from perfumeDTO");
	}

	public PerfumeDTO(String brand, Double price, boolean fragrance, Double weight) {
		super();
		this.brand = brand;
		this.price = price;
		this.fragrance = fragrance;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "PerfumeDTO [brand=" + brand + ", price=" + price + ", fragrance=" + fragrance + ", weight=" + weight
				+ "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isFragrance() {
		return fragrance;
	}

	public void setFragrance(boolean fragrance) {
		this.fragrance = fragrance;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

}
