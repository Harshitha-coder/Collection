package com.xworkz.datastore.dto;

import com.xworkz.datastore.constants.*;

import java.io.Serializable;

public class HighwayDTO implements Serializable, Comparable<HighwayDTO> {
	private String id;
	private int number;
	private String stateName;
	private HighwayType type;
	private double length;
	private boolean condition;
	private String contractCompany;

	public HighwayDTO() {
		// TODO Auto-generated constructor stub
	}

	public HighwayDTO(String id, int number, String stateName, HighwayType type, double length, boolean condition,
			String contractCompany) {
		super();
		this.id = id;
		this.number = number;
		this.stateName = stateName;
		this.type = type;
		this.length = length;
		this.condition = condition;
		this.contractCompany = contractCompany;
	}

	@Override
	public int compareTo(HighwayDTO obj) {
		double value = obj.getLength();
		if (this.length == value)
			return 0;
		if (this.length > value)
			return 1;
		if (this.length < value)
			return -1;
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof HighwayDTO) {
			HighwayDTO casted = (HighwayDTO) obj;
			if (this.stateName.equals(casted.getStateName()))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "HighwayDTO [id=" + id + ", number=" + number + ", stateName=" + stateName + ", type=" + type
				+ ", length=" + length + ", condition=" + condition + ", contractCompany=" + contractCompany + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public HighwayType getType() {
		return type;
	}

	public void setType(HighwayType type) {
		this.type = type;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public boolean isCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
	}

	public String getContractCompany() {
		return contractCompany;
	}

	public void setContractCompany(String contractCompany) {
		this.contractCompany = contractCompany;
	}

}
