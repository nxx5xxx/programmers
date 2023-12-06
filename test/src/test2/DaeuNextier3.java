package test2;

import java.util.Arrays;

public class DaeuNextier3 {

	public static void main(String[] args) {
		int[] numbers = {5,4,2,6,1,3};
		int tmp=0;
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i;j<numbers.length;j++) {
				if(numbers[i]>numbers[j]) {
				tmp = numbers[j];
				numbers[j] = numbers[i];
				numbers[i] = tmp;
				}
			}
			
		}
		System.out.println(Arrays.toString(numbers));

	}

}
