package Array;

public class EnhancedOrForEachLoopL4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// In this we are going to use Enhance Loop/for Each Loop

		int[] employeeID = new int[11];// we intialize the array size as well that is 15 in this case

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
		for (int fetchId : employeeID) {

			System.out.println("EmployeeID is:" + fetchId);

		}

		// lets create 3X3 2D array

		System.out.println("2DArray");

		int[][] TWODArray = { { 23, 44, 55 }, { 11, 22, 33 }, { 45, 67, 44 } };

		// Now lets print 2DArray

		for (int[] fetchArrayInside : TWODArray) {

			for (int fetchDataFromEachArrayInside : fetchArrayInside) {

				System.out.print(fetchDataFromEachArrayInside + " ");

			}
			System.out.println();

		}

		int[][] jaggedArray2 = new int[3][];

		jaggedArray2[0] = new int[3];
		jaggedArray2[1] = new int[2];
		jaggedArray2[2] = new int[3];

		jaggedArray2[0][0] = 12;
		jaggedArray2[0][1] = 12;
		jaggedArray2[0][2] = 12;

		jaggedArray2[1][0] = 13;
		jaggedArray2[1][1] = 13;

		jaggedArray2[2][0] = 14;
		jaggedArray2[2][1] = 14;
		jaggedArray2[2][2] = 14;

		System.out.println("Jagged 2 Normal");

		for (int[] fetchArrayInside : jaggedArray2) {

			for (int fetchDataFromEachArrayInside : fetchArrayInside) {

				System.out.print(fetchDataFromEachArrayInside + " ");

			}
			System.out.println();

		}

	}

}
