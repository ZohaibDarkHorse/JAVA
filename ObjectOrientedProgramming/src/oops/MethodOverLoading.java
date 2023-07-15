package oops;


//Method overloading by number of parameters

class calculate{
	
	public int add(int a,int b) {
		
		return a+b;
		
	}
	
	
	public int add(int a,int b,int c) {
		
		return a+b+c;
	}
	
	//Method overloading by type
	
	public double add(double a,double b,double c) {
		
		return a+b+c;
	}
	
}


public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculate c1 = new calculate();
		
		System.out.println("add1:"+c1.add(3, 4));
		System.out.println("add2:"+c1.add(3, 7));
		System.out.println("add3:"+c1.add(3.1, 7.8,9.1));
		
		
		
		
	}

}
