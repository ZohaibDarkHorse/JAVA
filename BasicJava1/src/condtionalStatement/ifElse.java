package condtionalStatement;

public class ifElse {

	public static void main(String[] args) {
		
		int age=0;
		
		
		if(age>=10 && age<18) {
			
			System.out.println("Candidate eligible for only bicycle");
		}
		else if(age>=18) {
			
			System.out.println("Candidate is eligible for all cycle,bike,car");
		}
		else {
			
			System.out.println("Not eigible");
		}
	}
}
