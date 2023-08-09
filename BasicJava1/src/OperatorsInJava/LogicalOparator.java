package OperatorsInJava;

public class LogicalOparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Logical operators are ==,!=,<=,>=,||
		
		//NOT opearor
		boolean r3=(1!=2);
		System.out.println(r3);
		
		//Or operator both conditions needs to be true
		boolean r1=(5>6 || 5!=6);
		
		System.out.println(r1);
		
		//AND operator  both condition need to be true
		boolean r2=(5==6 & 1==1);
		System.out.println(r1);
	}

}
