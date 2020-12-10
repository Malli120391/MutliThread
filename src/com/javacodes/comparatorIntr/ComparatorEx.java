package com.javacodes.comparatorIntr;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.javacodes.comparatorIntr.employee.Employee;

public class ComparatorEx{

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(101, "Sandeep", 100000.00, LocalDate.of(2010, 7, 10)));
        employees.add(new Employee(102, "Naresh", 95000.50, LocalDate.of(2017, 3, 19)));
        employees.add(new Employee(103, "Nazeer", 134000.00, LocalDate.of(2017, 9, 28)));
        employees.add(new Employee(104, "Amarnadh", 100000.00, LocalDate.of(2016, 5, 18)));
		
        System.out.println("Employees : " + employees);

     
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("\nEmployees (Sorted by Name) : " + employees);

        
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("\nEmployees (Sorted by Salary) : " + employees);

        
        Collections.sort(employees, Comparator.comparing(Employee::getJoiningDate));
        System.out.println("\nEmployees (Sorted by JoiningDate) : " + employees);

        
        Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());
        System.out.println("\nEmployees (Sorted by Name in descending order) : " + employees);

        
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary)
                                    .thenComparing(Employee::getName));
        System.out.println("\nEmployees (Sorted by Salary and Name) : " + employees);
    }
		

	}

	


