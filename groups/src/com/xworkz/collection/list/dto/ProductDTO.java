package com.xworkz.collection.list.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable, Comparable<ProductDTO> {

	private String name;
	private String brand;
	private int price;
	private double quantity;

	public ProductDTO() {
		System.out.println("invoked default constructor from productDTO");
	}

	public ProductDTO(String name, String brand, int price, double quantity) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(ProductDTO ref) {
		int otherValue = ref.getPrice();
		if (this.price == otherValue)
			return 0;
		if (this.price > otherValue)
			return -1;
		if (this.price < otherValue)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
}
