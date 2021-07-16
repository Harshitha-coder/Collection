package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumberTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number1 = "7899186099";
		String number2 = "9901367724";
		String number3 = "8970808947";
		String number4 = "9980971095";
		String number5 = "9972862446";
		String number6 = "8971255172";
		String number7 = "9980620137";
		String number8 = "7026096422";
		String number9 = "6360506363";
		String number10 = "6363534943";

		Collection collection = new ArrayList();
		boolean added = false;
		added = collection.add(number7);
		added = collection.add(number8);
		added = collection.add(number5);
		added = collection.add(number3);
		added = collection.add(number7);
		added = collection.add(number8);
		added = collection.add(number4);
		added = collection.add(number2);
		added = collection.add(number9);
		added = collection.add(number1);
		System.out.println("added:" + added);

		int total = collection.size();
		System.out.println("total:" + total);

		// collection.clear();

		String check = "9972862446";
		boolean contain = collection.contains(check);
		System.out.println("contain:" + contain);

		boolean removed = collection.remove("7899186099");
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
