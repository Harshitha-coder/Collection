package com.xworkz.unique.comparator;

import java.util.Comparator;

import com.xworkz.unique.dto.KitchenItemDTO;

public class KitchenUsedForComparator implements Comparator<KitchenItemDTO> {

	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
		return o1.getUsedFor().compareTo(o2.getUsedFor());
	}
}
