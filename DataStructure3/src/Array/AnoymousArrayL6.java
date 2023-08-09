package Array;

//1)Array without any name is called as Anonymous Array
//
//2)Anonymous can be only used once mainly used to passed as arguments

class multiplyArray {

	public int multiply(int[] num) {

		int result = 0;

		for (int val : num) {

			result += val;
		}

		return result;
	}

}

public class AnoymousArrayL6 {

	public static void main(String args[]) {

		multiplyArray m1 = new multiplyArray();

		int res = m1.multiply(new int[] { 12, 13, 45, 67 });// here we are passing a anonymous array as an argument

		System.out.println("Sum of array is:" + res);

	}

}
