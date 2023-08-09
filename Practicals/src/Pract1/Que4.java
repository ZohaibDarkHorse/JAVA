package Pract1;
// write a Java program to find the index of a specific elements in an integer array? 
public class Que4 {

	public static void findIndex(int[]arr,int elementTofind) {
		
		int i;
		for( i=0;i<arr.length;i++) {
			if(arr[i]==elementTofind)
			  break;
		} 
		System.out.println("Element found at index:"+i);
		
	}
	
	public static void main(String args[]) {
		
		int[] arr= {22,55,66,33,72};
		
		findIndex(arr, 72);
		
		
	}
}
