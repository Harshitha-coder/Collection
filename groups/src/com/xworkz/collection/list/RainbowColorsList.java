package com.xworkz.collection.list;

import java.util.*;

public class RainbowColorsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> colors = new ArrayList<String>();
		colors.add("Violet");
		colors.add("Indigo");
		colors.add("Blue");
		colors.add("Green");
		colors.add("yellow");
		colors.add("Orange");
		colors.add("Red");
		
		Collections.sort(colors);//sort(object)
		for(int i=0;i<colors.size();i++)
		{
			System.out.println(colors.get(i));
		}

		System.out.println("before adding the element:" + colors.get(6));

		colors.add(6, "White");// add(index,element)
		ListIterator<String> iterator = colors.listIterator(4);// listIterator()
		System.out.println("after adding the element:" + colors.get(6));
		System.out.println("elements size:" + colors.size());// size()
		System.out.println("index at:" + iterator.nextIndex());// nextIndex()
		System.out.println("index of indigo is:" + colors.indexOf("Indigo"));// indexOf(object)
		while (iterator.hasPrevious())// hasPrevious()
		{
			System.out.println("backward elements:" + iterator.previous());// previous()

		}
		while (iterator.hasNext())// hasNext()
		{
			System.out.println("forward elements:" + iterator.next());// next()

		}
		System.out.println("befor set:" + colors.set(2, "Green"));// set(index,element)
		System.out.println("after set:" + colors.set(2, "Green"));

		System.out.println("removed element at 5th index is:" + colors.remove(5));// remove(index)
		System.out.println("removed element is:" + colors.remove("Blue"));// remove(object)
		System.out.println("elemets between 3 to 6 idex is:" + colors.subList(3, 6));// sublist(fromIndex,toIndex)
		System.out.println("element present in the list:" + colors.contains("Violet"));// contains(object)
		System.out.println("removed all elements:" + colors.removeAll(colors));// removeAll(collection)

	}

}
