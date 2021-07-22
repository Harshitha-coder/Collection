package com.xworkz.unique.tester;


import java.util.Collection;

import com.xworkz.unique.dao.*;
import com.xworkz.unique.dto.KitchenItemDTO;

public class KitchenItemTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KitchenItemDTO item1 = new KitchenItemDTO("Pressure Cooker", 1299D, "Rice Cooking", "Silver");
		
		KitchenItemDTO item2 = new KitchenItemDTO("Citrus Juicer", 1495D, "ToMakeJucie", "Plastic");
		
		KitchenItemDTO item3 = new KitchenItemDTO("Frying Pan", 2499D, "Frying", "Aluminium");
		
		KitchenItemDAO dao = new KitchenItemImpl();
		dao.saveUnique(item3);
		dao.saveUnique(item2);
		dao.saveUnique(item1);

		Collection<KitchenItemDTO> usedFor=dao.findAllSortByUsedFor();
		for(KitchenItemDTO kitchen:usedFor)
		{
			System.out.println("found all by used for:"+kitchen);
		}
		
		Collection<KitchenItemDTO> used=dao.findAllSortByUsedForDesc();
		for(KitchenItemDTO kitchen:used)
		{
			System.out.println("found all by used for desc:"+kitchen);
		}
		
		Collection<KitchenItemDTO> name=dao.findAllSortByName();
		for(KitchenItemDTO kitchen:name)
		{
			System.out.println("found all by name:"+kitchen);
		}
		
		Collection<KitchenItemDTO> price=dao.findAllSortByPriceDesc();
		for(KitchenItemDTO kitchen:price)
		{
			System.out.println("found all by price desc:"+kitchen);
		}
		
		
	}

}
