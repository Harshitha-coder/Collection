package com.xworkz.collection.generics;

import java.util.*;

public class GenericCountryCollection {

	public static void main(String[] args) {

		String india = "India";
		String brazil = "Brazil";
		String china = "China";
		String france = "France";
		String germany = "Germany";
		String italy = "Italy";

		Collection<String> collection = new ArrayList<>();
		collection.add(germany);
		collection.add(france);
		collection.add(italy);
		collection.add(china);
		collection.add(brazil);
		collection.add(india);

		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value.toUpperCase());
		}

	}

}
