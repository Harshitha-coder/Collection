package com.xworkz.collection.dto;

public class CosmeticDTO {

	private String name;
	private String brand;
	private Integer price;
	private boolean coloringEffect;
	private boolean dried;
	private boolean longLast;
	private Double weight;

	public CosmeticDTO() {
		System.out.println("invoked default constructor from cosmeticDTO");
	}

	public CosmeticDTO(String name, String brand, Integer price, boolean coloringEffect, boolean dried,
			boolean longLast, Double weight) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.coloringEffect = coloringEffect;
		this.dried = dried;
		this.longLast = longLast;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [name=" + name + ", brand=" + brand + ", price=" + price + ", coloringEffect="
				+ coloringEffect + ", dried=" + dried + ", longLast=" + longLast + ", weight=" + weight + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method from cosmeticDTO");
		if (obj == null)
			return false;
		if (obj instanceof CosmeticDTO) {
			CosmeticDTO ref = (CosmeticDTO) obj;
			if (this.price.equals(ref.getPrice()) && this.name.equalsIgnoreCase(ref.getName())
					&& this.brand.equalsIgnoreCase(ref.getBrand())) {
				System.out.println("cosmetic is equals:" + this.brand);
				return true;
			} else {
				System.out.println("cosmetic is not equals:" + this.brand);
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public boolean isColoringEffect() {
		return coloringEffect;
	}

	public void setColoringEffect(boolean coloringEffect) {
		this.coloringEffect = coloringEffect;
	}

	public boolean isDried() {
		return dried;
	}

	public void setDried(boolean dried) {
		this.dried = dried;
	}

	public boolean isLongLast() {
		return longLast;
	}

	public void setLongLast(boolean longLast) {
		this.longLast = longLast;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

}
