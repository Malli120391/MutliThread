package com.javacodes.comparatorIntr1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonCom{
	
	private String name;
	private int age;
	
	public PersonCom(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class ComparatorEx1 {

	public static void main(String[] args) {
		
		List<PersonCom> listOfPerson = new ArrayList<PersonCom>();
        listOfPerson.add(new PersonCom("Sandeep", 27));
        listOfPerson.add(new PersonCom("Naresh", 26));
        listOfPerson.add(new PersonCom("Nazeer", 28));
        listOfPerson.add(new PersonCom("Amarnadh", 27));
		
		Comparator<PersonCom> comparator = new Comparator<PersonCom>() {

			@Override
			public int compare(PersonCom o1, PersonCom o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		
       Collections.sort(listOfPerson, comparator);
       
       System.out.println(" sort persons by age in ascending order");
       for (PersonCom personCom : listOfPerson) {
    	   System.out.println("Person Name: "+ personCom.getName());
		
	}
       System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       
       Collections.sort(listOfPerson, (PersonCom o1, PersonCom o2) ->{
    	   return o1.getAge() - o2.getAge();
       });
       System.out.println(" sort persons by age in ascending order");
       
       listOfPerson.forEach((personCom) ->System.out.println(" Person name : " + personCom.getName()));
		
	}

}
