package com.xyz;
public class Student {
	String name;   
	int age;
	String address;	
	public static void main(String args[]) {
		Student s = new Student();  
		s.address = "Kanpur";
		s.age = 25;
		s.name = "CapG";
		System.out.println(s.address + " " + s.name);
	}
}
