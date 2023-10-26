package permutationTest;

import java.util.Arrays;

public class 중복순열연습 {

	static int[] out = new int[3];
	static int sw = 0;
	public static void main(String[] args) {
		
		perm(0);
		System.out.println(sw);
	}
	static void perm(int index) {
		System.out.println("인덱스 : "+index);
		System.out.println("실행전 : "+Arrays.toString(out));
		if(index == 3) {
			System.out.println(Arrays.toString(out));
			return;//함수를 실행했던 위치로 돌아가서 이전 i의 값에 이어서 진행
		}

		System.out.println("for문 진입");
		System.out.println("----------------------");
		for (int i = -1; i < 2; i++) {
			System.out.println("내부"+index+"i : "+i);
			out[index] = i;
			sw ++;
			perm(index+1);
		}

	}
}