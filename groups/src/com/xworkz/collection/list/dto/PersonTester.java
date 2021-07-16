package com.xworkz.collection.list.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class PersonTester {

	public static void main(String[] args) {

		PersonDTO person1 = new PersonDTO("Harshitha", 21, "harshitha@gmail.com");
		PersonDTO person2 = new PersonDTO("Sunil", 26, "sunil@gmail.com");
		PersonDTO person3 = new PersonDTO("Ranjitha", 23, "ranjitha@gmail.com");
		PersonDTO person4 = new PersonDTO("Sachin", 24, "sachin@gmail.com");
		PersonDTO person5 = new PersonDTO("Sunitha", 22, "sunitha@gmail.com");

		List<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(person5);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		list.add(person1);

		Collections.sort(list);
		for (PersonDTO person : list) {
			System.out.println(person);
			System.out.println(person.getAge());

		}
	}
}
