package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ActorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actor1 = "Dharshan";
		String actor2 = "Rashmika";
		String actor3 = "Vijay";
		String actor4 = "Kajal";
		String actor5 = "Ram";
		String actor6 = "Yash";
		String actor7 = "Siddu";
		String actor8 = "Nithin";
		String actor9 = "Surya";
		String actor10 = "AlluArjun";

		Collection collection = new ArrayList();
		boolean added = false;
		added = collection.add(actor7);
		added = collection.add(actor8);
		added = collection.add(actor5);
		added = collection.add(actor3);
		added = collection.add(actor7);
		added = collection.add(actor8);
		added = collection.add(actor4);
		added = collection.add(actor2);
		added = collection.add(actor9);
		added = collection.add(actor1);
		System.out.println("added:" + added);

		int total = collection.size();
		System.out.println("total:" + total);

		// collection.clear();

		String check = "Vijay";
		boolean contain = collection.contains(check);
		System.out.println("contain:" + contain);

		boolean removed = collection.remove("Dharshan");
		System.out.println("removed:" + removed);

		Iterator iterator = collection.iterator();
		iterator.hasNext();
		Object obj = iterator.next();
		System.out.println(obj);

		iterator.hasNext();
		iterator.hasNext();

		Object obj1 = iterator.next();
		System.out.println(obj1);

	}

}
