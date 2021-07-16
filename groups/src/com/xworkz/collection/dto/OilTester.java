package com.xworkz.collection.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.constants.*;

public class OilTester {

	public static void main(String[] args) {

		OilDTO dto = new OilDTO("Freedom", OilType.SUNFLOWER, OilColor.GOLD, true, true, 170D);

		OilDTO dto1 = new OilDTO("Parachute", OilType.COCONUT, OilColor.LIGHTYELLLOW, true, false, 190D);

		OilDTO dto2 = new OilDTO("Bajaj", OilType.ALMOND, OilColor.GOLD, true, false, 100D);

		Collection<OilDTO> collection = new ArrayList<OilDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);

		Iterator<OilDTO> iterator = collection.iterator();
		while (iterator.hasNext()) {
			OilDTO ref = iterator.next();
			System.out.println(ref);
			if (ref.getPrice() != null && ref.getPrice() > 100) {
				System.out.println("oil price is high");
			}
		}

		OilDTO temp = new OilDTO("BAJAJ", OilType.ALMOND, OilColor.GOLD, true, false, 100D);
		boolean contain = collection.contains(temp);
		System.out.println(contain);
	}

}