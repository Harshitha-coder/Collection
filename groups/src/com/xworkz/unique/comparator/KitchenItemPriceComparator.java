package com.xworkz.unique.comparator;

import java.util.Comparator;

import com.xworkz.unique.dto.KitchenItemDTO;

public class KitchenItemPriceComparator implements Comparator<KitchenItemDTO>{

	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
		Double price1=o1.getPrice();
		Double price2=o2.getPrice();
		return price1.compareTo(price2);
	}
}
