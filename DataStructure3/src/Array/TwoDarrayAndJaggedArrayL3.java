package Array;

public class TwoDarrayAndJaggedArrayL3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lets create 3X3 2D array

		System.out.println("2DArray 1 Normal");

		int[][] TWODArray = { { 23, 44, 55 }, { 11, 22, 33 }, { 45, 67, 44 } };

		// Now lets print 2DArray

		for (int row = 0; row < 3; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.print(TWODArray[row][col] + " ");

			}
			System.out.println();

		}

		// Now Lets Create 3X3 array with different way
		int[][] array = new int[3][3];

		array[0][0] = 12;
		array[0][1] = 12;
		array[0][2] = 12;

		array[1][0] = 13;
		array[1][1] = 13;
		array[1][2] = 13;

		array[2][0] = 14;
		array[2][1] = 14;
		array[2][2] = 14;

		System.out.println("2DArray 2 Normal");

		for (int row = 0; row < 3; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.print(TWODArray[row][col] + " ");

			}
			System.out.println();

		}

		// Jagged Array

		int[][] jaggedArray = { { 23, 44, 55 }, { 11, 22 }, { 45, 67, 44 } };

		// Now lets print 2DArray

		System.out.println("Jagged 1 Normal");
		for (int row = 0; row < 3; row++) {

			for (int col = 0; col < jaggedArray[row].length; col++) {

				System.out.print(TWODArray[row][col] + " ");

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

		for (int row = 0; row < 3; row++) {

			for (int col = 0; col < jaggedArray2[row].length; col++) {

				System.out.print(jaggedArray2[row][col] + " ");

			}
			System.out.println();

		}

	}

}
