package com.xworkz.collection.dto;

import java.io.Serializable;

public class ChoclateDTO implements Serializable {

	private String name;
	private Integer price;
	private boolean goodTaste;
	private String flavour;
	private boolean quality;
	private boolean fssai;

	public ChoclateDTO() {
		System.out.println("invoked default constructor from choclateDTO");
	}

	public ChoclateDTO(String name, Integer price, boolean goodTaste, String flavour, boolean quality, boolean fssai) {
		super();
		this.name = name;
		this.price = price;
		this.goodTaste = goodTaste;
		this.flavour = flavour;
		this.quality = quality;
		this.fssai = fssai;
	}

	@Override
	public String toString() {
		return "ChoclateDTO [name=" + name + ", price=" + price + ", goodTaste=" + goodTaste + ", flavour=" + flavour
				+ ", quality=" + quality + ", fssai=" + fssai + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method from choclateDTO");
		if (obj == null)
			return false;
		if (obj instanceof ChoclateDTO) {
			ChoclateDTO ref = (ChoclateDTO) obj;
			if (this.price.equals(ref.getPrice()) && this.flavour.equalsIgnoreCase(ref.getFlavour())
					&& this.name.equalsIgnoreCase(ref.getName())) {
				System.out.println("choclate is equals:" + this.name);
				return true;
			} else {
				System.out.println("choclate is not equals:" + this.name);
				return false;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public boolean isGoodTaste() {
		return goodTaste;
	}

	public void setGoodTaste(boolean goodTaste) {
		this.goodTaste = goodTaste;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public boolean isFssai() {
		return fssai;
	}

	public void setFssai(boolean fssai) {
		this.fssai = fssai;
	}

}
