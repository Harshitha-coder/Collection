package com.xworkz.collection.list.dto;

import java.io.Serializable;

public class StreetDTO implements Serializable {
	private String name;
	private Integer pincode;
	private String landMark;
	private String city;
	
	public StreetDTO() {
		System.out.println("invoked default constructor from StreetDTO");
	}

	public StreetDTO(String name, Integer pincode, String landMark, String city) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.landMark = landMark;
		this.city = city;
	}

	@Override
	public String toString() {
		return "StreetDTO [name=" + name + ", pincode=" + pincode + ", landMark=" + landMark + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
