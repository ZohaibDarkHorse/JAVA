package Array;

//We create array using new key word if we don't know the amount of value we need to store inside the array
public class CreatingArrayUsingNewKeywordL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] employeeID = new int[10];// we intialize the array size as well that is 15 in this case
		employeeID=new int[15];
		//System.out.println(employeeID.length);
		//System.out.println(employeeID);
		// lets add value
		employeeID[0] = 1100;
		employeeID[1] = 1101;
		employeeID[2] = 1102;
		employeeID[3] = 1103;
		employeeID[4] = 1104;
		employeeID[5] = 1105;
		employeeID[6] = 1106;
		employeeID[7] = 1107;
		employeeID[8] = 1108;
		employeeID[9] = 1109;
		employeeID[10] = 11010;

		// lets prints the value
		for (int i = 0; i < 10; i++) {

			System.out.println("EmployeeID is:" + employeeID[i]);

		}

	}

}
