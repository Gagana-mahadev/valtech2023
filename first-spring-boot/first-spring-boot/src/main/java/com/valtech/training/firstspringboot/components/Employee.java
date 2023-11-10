package com.valtech.training.firstspringboot.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int age;
	private int experience;
	private int seniority;
	private int salary;
	private int deptid;

	public Employee() {
	}

	public Employee(String name, int age, int experience, int seniority, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.seniority = seniority;
		this.salary = salary;
	}

	public Employee(int id, String name, int age, int experience, int seniority, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.seniority = seniority;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", experience=" + experience + ", seniority="
				+ seniority + ", salary=" + salary + "]";
	}

//	@Override
//	public int compareTo(Employee o) {
//		return this.name.compareTo(o.name);
//	}
//	
//	@Override
//	public String toString() {
//		return "Employee [seniority=" + seniority + " , experience=" + experience + " , name=" + name + " , age=" + age + " , salary=" + salary + "]";
//	}
//	
//	public static void main(String[] args) {
//		List<Employee> employees =new  ArrayList<>();
//		employees.add(new Employee(111,"Arun",24,5,10,150000));
//		employees.add(new Employee(121,"Ram",22,8,12,80000));
//	    employees.add(new Employee(131,"pranav",27,4,8,60000));
//	    employees.add(new Employee(141,"Gagana",24,2,5,50000));
//	    
//	    System.out.println("Employee before sorting:");
//	    for(Employee emp : employees)
//	    {
//	    	System.out.println(emp);
//	    }
//	    
//	    Collections.sort(employees);
//	    
//	    System.out.println("\n Employees after sorting by name:");
//	    
//	    for(Employee emp : employees)
//	    {
//	    	System.out.println(emp);
//	    }
//	    
//	    
//	}
}
