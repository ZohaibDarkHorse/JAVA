package OperatorsInJava;

public class RelationalOperators {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		boolean result = a == b;

		System.out.println("yes its:" + result);
		
		//lets changethe value of a and b
		a=5;
		b=6;	
		result = a >= b;
		System.out.println("yes its:" + result);
		
		result = a <= b;
		System.out.println("yes its:" + result);
		
		result =a!=b;
		System.out.println("yes its:" + result);
		
		result =a>b;
		System.out.println("yes its:" + result);
		
		result =a<b;
		System.out.println("yes its:" + result);
	}
}
