package com.xyz;

public class Employee extends Object {

	 public static void main(String args[]) {
			
			EmployeeCheck e = new EmployeeCheck();
			e.display();	
		}

}
 class EmployeeCheck{
		private String name = "Vivek";
		private int age = 25;
		private float salary = 20000f;
		private String address = "ABCDE";
		
		EmployeeCheck(String n, int a, float s, String add){  
			name = n;
			age = a;
			salary = s;
			address = add;
		}
		EmployeeCheck(){
			name = "abc";
		}
		void display() {
			
			System.out.println(name + " " + age + " " + salary);
		}
}


