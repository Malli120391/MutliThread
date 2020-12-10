package com.javacodes.comparableIntSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.javacodes.comparableInt.Person;

public class PersonSorterInASC {

	public static void main(String[] args) {

		sortUserDefinedObjectsInAsc();
		
	}
	
	private static void sortUserDefinedObjectsInAsc() {
		
		List<Person> persons = new ArrayList<Person>();
		Person person1 = new Person(1, "Sandepp", 29);
		Person person2 = new Person(2, "Naresh", 25);
		Person person3 = new Person(3, "Nazeer", 35);
		Person person4 = new Person(4, "Amarnagh", 30);
		Person person5 = new Person(5, "Mohan", 34);
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		
		System.out.println("Before Sorting: "+persons);
		Collections.sort(persons);
		System.out.println("After Sorting: "+persons);
		
		Collections.sort(persons, Collections.reverseOrder());
		  
		  System.out.println(" Sort in decending order : " + persons);
		
	}
	

}
