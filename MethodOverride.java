package com.xyz;

public class MethodOverride {
	
	public static void main(String args[]) {
		
	}
	

}


class M1 {
	
	protected M1 display(String s) {
		System.out.println(s);
		return new M1();
	}
	
	
	
}

class M2 extends M1{
	
	public M2 display(String s) {
		System.out.println(s);
		return new M2();
	}
	
	
	
}
