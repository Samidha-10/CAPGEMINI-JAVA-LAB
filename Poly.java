package com.xyz;

public class Poly {
	
	public static void main(String args[]) {
		Exam e1 = new Exam();
		System.out.println(e1.add(1, 1));
		System.out.println(e1.add(1, 1.0f));
		System.out.println(e1.add("abc", "1"));
		System.out.println(e1.add(1.0f, 2f));	
		
		
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
	 
	 float add(float a, float b) {
		 return a + b;
	 }
	
}

