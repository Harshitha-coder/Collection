package com.xworkz.collection.list.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class PerfumeTester {

	public static void main(String[] args) {

		PerfumeDTO perfume1 = new PerfumeDTO("FOGG", 185D, true, 100D);

		PerfumeDTO perfume2 = new PerfumeDTO("Engage", 200D, true, 135D);

		PerfumeDTO perfume3 = new PerfumeDTO("Villain", 399D, true, 20D);

		PerfumeDTO perfume4 = new PerfumeDTO("Ocean", 495D, true, 30D);

		List<PerfumeDTO> perfumes = new ArrayList<PerfumeDTO>();
		perfumes.add(perfume1);
		perfumes.add(perfume2);
		perfumes.add(perfume3);
		perfumes.add(perfume4);

		PerfumeDTO perfume5 = new PerfumeDTO("Dream Girl", 500D, true, 100D);
		System.out.println("before adding the element:" + perfumes.get(3));

		perfumes.add(3, perfume5);
		System.out.println("after adding the element:" + perfumes.get(3));
		System.out.println("size of elements:" + perfumes.size());
		System.out.println("added all elements:" + perfumes.addAll(perfumes));
		System.out.println("before set:" + perfumes.set(3, perfume2));
		System.out.println("after set:" + perfumes.set(3, perfume2));

		ListIterator<PerfumeDTO> iterator = perfumes.listIterator(2);
		while (iterator.hasPrevious()) {
			System.out.println("backward elements:" + iterator.previous());
		}

		while (iterator.hasNext()) {
			System.out.println("forward elements:" + iterator.next());
		}

		System.out.println("all elements contained in the list are:" + perfumes.containsAll(perfumes));
		boolean temp=perfumes.contains(perfume3);
		System.out.println("perfume3 is contained in list:"+temp);
		System.out.println("perfume1 removed:" + perfumes.remove(perfume1));
		System.out.println("elements are removed from the list:" + perfumes.removeAll(perfumes));

	}

}
