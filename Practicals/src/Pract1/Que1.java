package Pract1;

//Write a program to demonstrate method overloading with 3 different parameters


class Multiply{
	public int multiply(int num1,int num2){
		 
		return num1*num2;
		
	}
	
	public int multiply(int num1,int num2,int num3){
		 
		return num1*num2*num3;
		
	}
	public int multiply(int num1,int num2,int num3,int num4){
		 
		return num1*num2*num3*num4;
		
	}
	
	
}
public class Que1 {
   
	
	public static void main(String args[]) {
		
		Multiply m1 = new Multiply();
		
		System.out.println(m1.multiply(2, 2));
		System.out.println(m1.multiply(2, 2,2));
		System.out.println(m1.multiply(2, 2,2,2));
		
	}
	
}
