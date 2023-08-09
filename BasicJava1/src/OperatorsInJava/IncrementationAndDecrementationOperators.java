package OperatorsInJava;

public class IncrementationAndDecrementationOperators {

	public static void main(String[] args) {
		
		int a=5;
		//increment operator a+1=5+1=6
		a++;
		int b=5;
		//decrement operator
		b--;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		
		//pre and post difference
		
		//post
		int c=7;
		int chkc=c++;
		System.out.println("chkc:"+chkc);
		
		//pre
		int c1=7;
		int chkc1=++c1;
		System.out.println("chkc1:"+chkc1);
		
	}
}
