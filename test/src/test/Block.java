package test;

import java.io.*;

class Block {
	static int[] d = new int[16];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		/*
		 * 예제로는 2 4 = 5와 4 2 6이 주어졌다
		 * 1*1~ 1*15 까지는 15개 고정 2*1~ 2*15 까지는 앞에 과정 두개를 더한 값이 뒤에과정이됨 예 : 2*1 -> 1두개 한가지
		 * 2*2 1네개,2한개 2가지 2*3 > 3가지 2*4 > 5가지 2*5 8가지 15까지 모든 점화식을 세워야 하는걸까? 1*m
		 * d(m)=1; 2*m d(m)= >>1=1 2=2 이후로 d(m)=d(m-1)+d(m-2) 3*m d(m)>> 1=1 2=3 d(m) =
		 * d(m-1) + 2*d(m-2) 4*m >>1=1 2=6 n*1 d(n)=1; n*2 d(n)>> 1=1, 2=2 >> d(n) =
		 * d(n-1) + d(n-2) n*3 >> 1=1 2=3 >> d(n) = d(n-1) + 2*d(m-2) 단 n*3에서는 4를넣었을때
		 * 4*2와 4*4의 경우의 수가 추가된다 n*4라던가 4*n이라던가 계속 햇갈리니 일단 코드로 짜보자
		 */ String[] str_arr = input.split(" ");
		int m = Integer.parseInt(str_arr[1]);
		switch (str_arr[0]) {
		case "1":
			System.out.println(dp1(m));
			break;
		case "2":
			System.out.println(dp2(m));
			break;
		case "3":
			System.out.println(dp3(m));
			break;
		case "4":
			System.out.println(dp4(m));
			break;
		default:
			System.out.println("아직 구현 되지 않았습니다 감사합니다.");
			break;
		}
	}

	static int dp1(int m) {
		return 1;
	}

	static int dp2(int m) {
		if (m == 1)
			return 1;
		if (m == 2)
			return 2;
		return dp2(m - 1) + dp2(m - 2);
	}

	static int dp3(int m){
		if(m == 1 )return 1;
		if(m == 2) return 3;
		return dp3(m-1)+2*dp3(m-2); 
		} 
	
	
	// n*2일때 기능 테스트 
	static int dp4(int n){ //0일때 지정해줘야 n-4가능
		if(n <= 3)return dp2(n);
		return dp2(n)+p4(n-4);
		}
	//네번째는 새로운 4*2가 추가되어 기존배열에서 새롭게 추가되는값
	static int p4(int n) {//3 2
		if(n<=0)return 1;
		if(n==1)return 2;
		return dp4(n)+p4(n-2)+p4(n-1);
	}
	
	/* n*2테스트
// 4에서 막힌다 앞에는 피보나치인데 n-4부터 짜지질않는다 접근법이 잘못된건지 점화식을 못세우고 있는건지 모르겠다 1 : 1, 2: 2,
// 3: 3, 4: 5 + 1, 5: 8+2 ,6: 13+5 , 7: 21+10 , 8: 34+21, 9: 55+41, 10: 89+78
// 오류가 있었다 10에 80 그럼 점화식을 세울수가 있다 2+1+2=5, 3+2+5=10, 6+5+10=21,
// 10+10+21=41,18+21+41=80 이런식으로 유도가 가능하다 ///여기서부터는 제출시간이 넘어 연습삼아 진행 */ 
}