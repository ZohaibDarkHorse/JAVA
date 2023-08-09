package Array;

// we create array this way if we know all the value that is needed inside an array

public class CreatingArrayUsingCurlyBracesL1 {

	public static void main(String args[]) {

		// array having integer value

		int[] age = { 29, 28, 23, 20, 15 };

		// lets access the array value using index
		System.out.println("Age at index 0:" + age[0]);
		System.out.println("Age at index 1:" + age[1]);
		System.out.println("Age at index 2:" + age[2]);
		System.out.println("Age at index 3:" + age[3]);
		System.out.println("Age at index 4:" + age[4]);

		// array having String value
		String[] names = { "Ashar", "Kazim", "Zohaib", "Taqu", "Amash" };

		// lets access the value using loop
		for (int i = 0; i < names.length; i++) {
			System.out.println("Names at index " + i + ":" + age[i]);

		}

	}

}
