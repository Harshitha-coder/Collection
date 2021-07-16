package com.xworkz.collection.list.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StreetTester {

	public static void main(String[] args) {
	
		StreetDTO street1=new StreetDTO("MGRoad",562101,"WaterTank","Chickballapur");
		
		StreetDTO street2=new StreetDTO("AMColony",562211,"Anjaneya Temple","GBD");
		
		StreetDTO street3=new StreetDTO("BBRoad",562101,"Sandharshini Hotel","Chickballapur");
		
		List<StreetDTO> streets=new ArrayList<StreetDTO>();
		streets.add(street1);
		streets.add(street2);
		streets.add(street3);
		

		StreetDTO street4 = new StreetDTO("Prashanth Nagar",562101,"Prakruthi School","Chickballapur");
		System.out.println("before adding the element:" + streets.get(2));

		streets.add(3, street4);
		System.out.println("after adding the element:" + streets.get(3));
		System.out.println("size of elements:" + streets.size());
		System.out.println("added all elements:" + streets.addAll(streets));
		System.out.println("before set:" + streets.set(3, street2));
		System.out.println("after set:" + streets.set(3, street2));

		ListIterator<StreetDTO> iterator = streets.listIterator(2);
		while (iterator.hasPrevious()) {
			System.out.println("backward elements:" + iterator.previous());
		}

		while (iterator.hasNext()) {
			System.out.println("forward elements:" + iterator.next());
		}

		System.out.println("all elements contained in the list are:" + streets.containsAll(streets));
		System.out.println("street1 removed:" + streets.remove(street1));
		
		boolean temp=streets.contains(street3);
		System.out.println("street3 is contained in list:"+temp);
		System.out.println("elements are removed from the list:" + streets.removeAll(streets));

	}

}
