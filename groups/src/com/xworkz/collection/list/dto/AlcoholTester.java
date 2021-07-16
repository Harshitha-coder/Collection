package com.xworkz.collection.list.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.dto.constants.AlcoholType;

public class AlcoholTester {

	public static void main(String[] args) {

		AlcoholDTO alcohol1 = new AlcoholDTO("Bacardi", 1500, true, 550D, AlcoholType.RUM);
		AlcoholDTO alcohol2 = new AlcoholDTO("Smirnoff", 1110, false, 750D, AlcoholType.VODKA);
		AlcoholDTO alcohol3 = new AlcoholDTO("McDowells", 580, true, 750D, AlcoholType.WHISKY);
		AlcoholDTO alcohol4 = new AlcoholDTO("Kingfisher", 145, false, 650D, AlcoholType.BEER);
		AlcoholDTO alcohol5 = new AlcoholDTO("Officers Choice", 300, true, 750D, AlcoholType.WHISKY);

		List<AlcoholDTO> list = new ArrayList<AlcoholDTO>();
		list.add(alcohol4);
		list.add(alcohol1);
		list.add(alcohol3);
		list.add(alcohol2);
		list.add(alcohol5);

		Collections.sort(list);
		for (AlcoholDTO alcohol : list) {
			System.out.println(alcohol);
			System.out.println(alcohol.getBrand());

		}

	}
}