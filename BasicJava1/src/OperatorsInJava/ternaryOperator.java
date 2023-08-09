package OperatorsInJava;


//condition?if true exec this:else exc this
public class ternaryOperator {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		String result=(a<b)?"a is less":"b is less";
		
		System.out.println(result);
		
		
		//find the smallest number using ternary operator
		int result1=(a<b)?((a<c)?a:b):((b<c?b:c));
		
		System.out.println("Smallest number among all three is:"+result1);
	}

}
