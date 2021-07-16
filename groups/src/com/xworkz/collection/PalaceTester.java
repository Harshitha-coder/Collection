package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PalaceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palace1 = "Mysore";
		String palace2 = "Banglore";
		String palace3 = "LotusMahal";
		String palace4 = "JaganMohan";
		String palace5 = "LalithaMahal";
		String palace6 = "JayalakshmiVilas";
		String palace7 = "Nalnad";
		String palace8 = "Malwala";
		String palace9 = "HillFort";
		String palace10 = "TippuSultan";

		Collection collection = new ArrayList();
		boolean added = false;
		added = collection.add(palace10);
		added = collection.add(palace6);
		added = collection.add(palace5);
		added = collection.add(palace3);
		added = collection.add(palace7);
		added = collection.add(palace8);
		added = collection.add(palace4);
		added = collection.add(palace2);
		added = collection.add(palace9);
		added = collection.add(palace1);
		System.out.println("added:" + added);

		int total = collection.size();
		System.out.println("total:" + total);
		
		//collection.clear();

		String check = "Mysore";
		boolean contain = collection.contains(check);
		System.out.println("contain:" + contain);

		boolean removed = collection.remove("IskonTemple");
		System.out.println("removed:" + removed);

		Iterator iterator = collection.iterator();
		iterator.hasNext();
		Object obj = iterator.next();
		System.out.println(obj);

		iterator.hasNext();
		iterator.hasNext();

		Object obj1 = iterator.next();
		System.out.println(obj1);

		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		Object obj2 = iterator.next();
		System.out.println(obj2);

	}

}
