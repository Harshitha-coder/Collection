package com.xworkz.unique.dto;

import java.io.Serializable;

public class KitchenItemDTO implements Serializable {

	private String name;
	private double price;
	private String usedFor;
	private String madeOf;

	public KitchenItemDTO() {
		// TODO Auto-generated constructor stub
	}

	public KitchenItemDTO(String name, double price, String usedFor, String madeOf) {
		super();
		this.name = name;
		this.price = price;
		this.usedFor = usedFor;
		this.madeOf = madeOf;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof KitchenItemDTO) {
			KitchenItemDTO casted = (KitchenItemDTO) obj;
			if (this.madeOf.equals(casted.getMadeOf()))
				return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "KitchenItemDTO [name=" + name + ", price=" + price + ", usedFor=" + usedFor + ", madeOf=" + madeOf
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public String getMadeOf() {
		return madeOf;
	}

	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}
}
