package permutationTest;

import java.util.Arrays;

public class 중복순열연습 {

	static int[] out = new int[4];
	static int sw = 0;
	public static void main(String[] args) {
		
		perm(0);
	}
	static void perm(int index) {
		if(index == 4) {
			System.out.println(Arrays.toString(out));
			return;//함수를 실행했던 위치로 돌아가서 이전 i의 값에 이어서 진행
		}
		for (int i = -1; i < 2; i++) {
			out[index] = i;
			perm(index+1);
		}

	}
}