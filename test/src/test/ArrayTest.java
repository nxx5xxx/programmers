package test;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		int[] arr1 = {1, 10, 20, 30};  
		int[] arr2 = arr1 ;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr2[0] = 40;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		*/
		
		int[] arr1 = {1, 10, 20, 30};
		int[] arr2 = new int[6]; 
		System.arraycopy(arr1, 1, arr2, 1, arr1.length-1);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr1, 3);
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = Arrays.copyOfRange(arr1, 2, 3);
		System.out.println(Arrays.toString(arr4));
		
		/*
		arr2[0] = 40;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = arr1.clone();
		System.out.println(Arrays.toString(arr3));
		*/
		/*
		 * int[][] arr1 = {{1, 2, 3, 4},{10,20,30}}; int[][] arr2 = new
		 * int[arr1.length][]; for(int i=0;i<arr1.length;i++) { arr2[i] =
		 * arr1[i].clone(); } System.out.println(Arrays.toString(arr2[0]));
		 * System.out.println(Arrays.toString(arr2[1]));
		 */
	}

}
