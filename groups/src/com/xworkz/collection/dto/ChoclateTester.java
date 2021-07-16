package com.xworkz.collection.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ChoclateTester {

	public static void main(String[] args) {
		ChoclateDTO dto = new ChoclateDTO("Munch", 10, true, "Almond", true, true);

		ChoclateDTO dto1 = new ChoclateDTO("DairyMilk", 80, true, "Oreo", true, true);

		ChoclateDTO dto2 = new ChoclateDTO("KachhaMangoBite", 1, true, "Mango", true, true);

		Collection<ChoclateDTO> collection = new ArrayList<ChoclateDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);

		Iterator<ChoclateDTO> iterator = collection.iterator();
		while (iterator.hasNext()) {
			ChoclateDTO ref = iterator.next();
			System.out.println(ref);
			if (ref.getPrice() != null && ref.getPrice() > 10) {
				System.out.println("choclate price is high");
			}
		}
		ChoclateDTO dto3 = new ChoclateDTO("KACHHAMANGOBITE", 1, true, "MANGO", true, true);
		boolean temp = collection.contains(dto3);
		System.out.println(temp);

	}

}
