package com.xworkz.collection.generics;

import java.util.*;

public class GenericSalaryCollection {

	public static void main(String[] args) {

		double salary1 = 500;
		double salary2 = 3000;
		double salary3 = 2000;
		double salary4 = 10000;
		double salary5 = 45000;

		Collection<Double> collection = new ArrayList<Double>();
		collection.add(salary1);
		collection.add(salary2);
		collection.add(salary3);
		collection.add(salary4);
		collection.add(salary5);

		Iterator<Double> iterator = collection.iterator();

		while (iterator.hasNext()) {
			double salary = iterator.next();
			System.out.println(salary);

			if (salary > 1000 && salary < 5000) {
				System.out.println("salary is good");
			} else if (salary < 1000) {
				System.out.println("Salary is  not good");
			} else if (salary > 5000) {
				System.out.println("great salary");
			} else {
				System.out.println("salary is not good at all");
			}

		}
	}
}
