package com.xworkz.collection.list.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SportTester {

	public static void main(String[] args) {

		SportDTO sport1 = new SportDTO("Cricket", 11, "England", "India");

		SportDTO sport2 = new SportDTO("Kabadi", 12, "TamilNadu", "India");

		SportDTO sport3 = new SportDTO("Tennis", 2, "France", "Australia");

		SportDTO sport4 = new SportDTO("Wrestling", 11, "Greece", "US");

		SportDTO sport5 = new SportDTO("VolleyBall", 6, "US", "Brazil");

		List<SportDTO> list = new ArrayList<SportDTO>();
		list.add(sport3);
		list.add(sport5);
		list.add(sport2);
		list.add(sport4);
		list.add(sport1);

		SportDTO temp = new SportDTO();
		Collections.sort(list, temp);// list type ref and comparator--super type(sort(list<T>,comparator super<T>
		for (SportDTO sport : list) {
			System.out.println(sport);

		}
	}

}
