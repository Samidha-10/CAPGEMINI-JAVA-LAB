package com.xyz;

public class PolyExample {

	public static void main(String args[]) {
		
		Exam e1 = new Exam();    
		System.out.println(e1.add(1, 1));
		System.out.println(e1.add(1, 1.0f));
		System.out.println(e1.add("abc", "1"));
		System.out.println(e1.add(1.0f, 2f));	
		System.out.println(e1.add(1.0f, 2f, (int)3f));
		short s=1;
	}
}


class PolyEx{
	
		int add(int a, int b) {
			return a+b;
		}
		
		
		float add(int a, float b) {
			
			return a + b;
		}
		
		
		String add(String a, String b) {
			return a + b;
		}
		
		
	
}



 class Exam extends PolyEx{

	 int add(int a, int b) {
		 System.out.println("in child");
		 return a+b;
	 }
	float add(float a, float b, int c) {
			 return a + b + c;
		 }
	 float add(float a, float b) {
		 return a + b;
	 }
	
}

