package Array;

public class ArrayLengthVsStringLength5 {

	// In this we are going to see different between length property and length()
	// method

	// So basically length as property is applied on array to get the size of array

	// While length() as method is applied on String class to get the size of a
	// String(remember String is not a primitive type but a class)

	public static void main(String args[]) {

		int[] a = { 12, 44, 55 };

		// Now lets find out the length/Size of array using .length property

		System.out.println("**********.length***********Property*********For *********Array");

		System.out.println("Size of array a is:" + a.length);

		int[][] a1 = { { 13, 24, 55, 62 }, { 12, 34 }, { 5, 7, 8, 9, 10 } };

		System.out.println("Size of array a1 is:" + a1.length);
		System.out.println("Size of array present at a1[0]:" + a1[0].length);
		System.out.println("Size of array present at a1[1]:" + a1[1].length);
		System.out.println("Size of array present at a1[2]:" + a1[2].length);

		System.out.println("**********length()***********Method*********For *********String Class");

		String name = "Zohaib";

		// Now lets find out the length of var name using .length() method

		System.out.println("length of var name is:" + name.length());

	}

	// DISADVANTAGES OF ARRAY

//	1)once array is create its size cannot be increased or decreased
//
//    2)Its only stores homogenous data elements

}
