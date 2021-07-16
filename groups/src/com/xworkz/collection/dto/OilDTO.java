package com.xworkz.collection.dto;

import java.io.Serializable;

import com.xworkz.collection.dto.constants.*;

public class OilDTO implements Serializable {

	private String brand;
	private OilType type;
	private OilColor color;
	private boolean refinedOil;
	private boolean usedForCooking;
	private Double price;

	public OilDTO() {
		System.out.println("invoked default constructor from oilType");
	}

	public OilDTO(String brand, OilType type, OilColor color, boolean refinedOil, boolean usedForCooking,
			Double price) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.refinedOil = refinedOil;
		this.usedForCooking = usedForCooking;
		this.price = price;
	}

	@Override
	public String toString() {
		return "OilDTO [brand=" + brand + ", type=" + type + ", color=" + color + ", refinedOil=" + refinedOil
				+ ", usedForCooking=" + usedForCooking + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method from oilDTO");
		if (obj == null)
			return false;
		if (obj instanceof OilDTO) {
			OilDTO ref = (OilDTO) obj;
			if (this.type.equals(ref.getType()) && this.price.equals(ref.getPrice())&&this.brand.equalsIgnoreCase(ref.getBrand())) {
				System.out.println("oil is equals:" + this.brand);
				return true;
			} else {
				System.out.println("oil is not equals:" + this.brand);
				return false;
			}
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public OilType getType() {
		return type;
	}

	public void setType(OilType type) {
		this.type = type;
	}

	public OilColor getColor() {
		return color;
	}

	public void setColor(OilColor color) {
		this.color = color;
	}

	public boolean isRefinedOil() {
		return refinedOil;
	}

	public void setRefinedOil(boolean refinedOil) {
		this.refinedOil = refinedOil;
	}

	public boolean isUsedForCooking() {
		return usedForCooking;
	}

	public void setUsedForCooking(boolean usedForCooking) {
		this.usedForCooking = usedForCooking;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
