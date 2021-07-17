package com.xworkz.collection.list.dto;

import java.io.Serializable;
import java.util.Comparator;

public class SportDTO implements Serializable, Comparator<SportDTO> {

	private String name;
	private int noOfPlayers;
	private String originatedCountry;
	private String mostPlayed;

	public SportDTO() {
		System.out.println("invoked default constructor from sportDTO");
	}

	public SportDTO(String name, int noOfPlayers, String originatedCountry, String mostPlayed) {
		super();
		this.name = name;
		this.noOfPlayers = noOfPlayers;
		this.originatedCountry = originatedCountry;
		this.mostPlayed = mostPlayed;
	}

	@Override
	public int compare(SportDTO obj1, SportDTO obj2) {
		if (obj1.getNoOfPlayers() == obj2.getNoOfPlayers())
			return 0;
		if (obj1.getNoOfPlayers() > obj2.getNoOfPlayers())
			return 1;
		return -1;
	}

	@Override
	public String toString() {
		return "SportDTO [name=" + name + ", noOfPlayers=" + noOfPlayers + ", originatedCompany=" + originatedCountry
				+ ", mostPlayed=" + mostPlayed + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public String getOriginatedCountry() {
		return originatedCountry;
	}

	public void setOriginatedCompany(String originatedCountry) {
		this.originatedCountry = originatedCountry;
	}

	public String getMostPlayed() {
		return mostPlayed;
	}

	public void setMostPlayed(String mostPlayed) {
		this.mostPlayed = mostPlayed;
	}
}
