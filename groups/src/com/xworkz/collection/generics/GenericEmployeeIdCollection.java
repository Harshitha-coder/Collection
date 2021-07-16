package com.xworkz.collection.generics;

import java.util.*;

public class GenericEmployeeIdCollection {

	public static void main(String[] args) {
		

		String id1 = "Bell123";
		String id2 = "Bell34";
		String id3 = "Bell15";
		String id4 = "Bell420";
		String id5 = "Bell222";

		Collection<String> collection = new ArrayList<String>();
		collection.add(id5);
		collection.add(id3);
		collection.add(id2);
		collection.add(id4);
		collection.add(id1);

		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}

	}

}
