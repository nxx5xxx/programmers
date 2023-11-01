package test;

public class FourTest {
	static int[] d = new int[16];
	
	public static void main(String[] args) {
		//4번째가 p의 1임
		//6번째가 p의 3번
		System.out.println("1-4");
		System.out.println(dp4(1));
		System.out.println();
		System.out.println("2-5");
		System.out.println(dp4(2));
		System.out.println();
		System.out.println("3-6");
		System.out.println(dp4(3));//
		System.out.println();
		System.out.println("4-7");
		System.out.println(dp4(4));//
		System.out.println();
		System.out.println("5-8");
		System.out.println(dp4(5));
		System.out.println();
		System.out.println("6-9");
		System.out.println(dp4(6));
		System.out.println();
		System.out.println("7-10");
		System.out.println(dp4(7));
		System.out.println();
		System.out.println("8-11");
		System.out.println(dp4(8));
		System.out.println();
		System.out.println("9-12");
		System.out.println(dp4(9));
		System.out.println();
		System.out.println("10-13");
		System.out.println(dp4(10));
		System.out.println();
		System.out.println("11-14");
		System.out.println(dp4(11));
		System.out.println();
		System.out.println("12-15");
		System.out.println(dp4(12));
	}
	static int dp2(int m) {
		if (m == 1)
			return 1;
		if (m == 2)
			return 2;
		return dp2(m - 1) + dp2(m - 2);
	}
	
	// n*4일때 기능 테스트 
	static int dp4(int n){ //0일때 지정해줘야 n-4가능
		if(n <= 3)return dp2(n);
		//if(n == 4)return 6;
		//if(d[n] != 0 )return d[n]; 
		return dp2(n)+p4(n-4);
		}//6-3 6 -2 
	
	//네번째는 새로운 4*2가 추가되어 기존배열에서 새롭게 추가되는값
	static int p4(int n) {//3 2
		if(n<=0)return 1;
		if(n==1)return 2;
		//if(n==2)return 2;
		return dp4(n)+p4(n-2)+p4(n-1);
		//2,1,2
	}
//	static int dp4(int n){ //0일때 지정해줘야 n-4가능
//		if(n <= 3)return dp2(n);
//		if(n == 4)return 6;
//		//if(d[n] != 0 )return d[n]; 
//		return dp2(n)+p4(n-3);
//	}
//	static int p4(int n) {
//		if(n<=0)return 0;
//		if(n==1)return 1;
//		if(n==2)return 2;
//		return dp4(n-1)+p4(n-2)+p4(n-1);
//	}
	/*
	 * p를 기준으로 정리
	 * p(0) = 0 
	 * p(1) = 1
	 * p(2) = 2 >> dp2(1)+p(0)+p(1)
	 * p(3) = 5 >> dp2(2)+p(1)+p(2)
	 * p(4) = 10 >> dp2(3)+p(2)+p(3)
	 */
	//p는 최종값에 dp2 n 을 더해줘야함
//	static int p4(int n) {
//		int tes = 0;
//		if(n<=0)return 0;
//		if(n==1)return 1;
//		if(n==2)return 2;
////		tes = dp2(n)+p4(n-1)+p4(n);
//		tes = dp2(n-1)+p4(n-2)+p4(n-1);//+p4(n);
//		System.out.println("dp2("+n+")"+dp2(n));
//		System.out.println("tes : "+tes);
//		//System.out.println("dp2("+n+"):"+ dp2(n) + " ,p4(n-1) : "+p4(n-1)+" ,p4(n) : "+p4(n));
//		return tes;
//	}
	
}
