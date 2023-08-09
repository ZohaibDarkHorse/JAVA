package oops;

public class Class {

	//this a class
	
	//instance variable
	int a;//primitive
	String name;
	
	//remember instance variable if value not allocate d default value get allocated 
	
	
	//default value for Strong is null and int is zero
	public static void main(String[] args) {
		
		int b;//this is a local variable its created inside a method and its scope is inside the function only
		
		
		//lets create of class object
		
		Class ob1 = new Class();//ob1 is object also called as reference variable
		
		//lets access instance variable from object ob1 
		
		System.out.println(ob1.a);
		System.out.println(ob1.name);
		//System.out.println(b); not possible because we need to intialize it as b is local variable
		
		//NOW LETS CHANGE VALUE OF INSTANCE VARIABLE
		 Class ob2 = new Class();
		 //set value
		 ob2.name="Zohaib Ahmad";
		 ob2.a=24;
		 
		
		//instance variable of objects are stored in heap memory while normal variable stored in stack memmory
	}
}
