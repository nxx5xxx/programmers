package test2;

import java.util.Arrays;

public class DaeuNextier2 {

	public static void main(String[] args) {
		int[] numbers = {5,4,2,6,1,3};
		int tmp=0;
		for(int i=1;i<numbers.length;i++) {
			for(int j = 0; j < numbers.length - i; j++) {
				if(numbers[j] > numbers [j + 1]) {
					tmp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));

	}

}
