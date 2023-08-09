package Pract1;

// 2. Write a program to create an object of an class which contains a method and call that class method in main method 

class Eid{
	
 public void EidGreet(String name) {
	 
	 System.out.println("Eid Mubrak:):"+name);
 }
	
}

public class Que2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eid e1 = new Eid();
		e1.EidGreet("Zohaib");
		
	}

}
