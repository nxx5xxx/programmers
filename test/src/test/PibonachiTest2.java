package test;

public class PibonachiTest2 {

	public static void main(String[] args) {
		//피보나치 수열과 멈춰야할값 매개변수로
		int pibo = 0;
		
		//피보나치 수열은 n-1 + n 항을 더하는것
		//D[n] = D[n-1]+D[n-2]( f(2)는 f(0)과 f(1)을 합한것이므로
		//특정항의 피보나치 수열을 구하는것
		System.out.println(pibo(6));
		
		//for문안쓰고 바텀업 피보나치 수열을 구하기
//		System.out.println(pibo2(0,6));
		
	}
	
	public static int pibo(int x) {
		if(x==0)return 0;
		if(x==1)return 1;
		return pibo(x-1)+pibo(x-2);
	}
	
//	public static int pibo2(int x,int cnt) {
//		if(cnt==0)return x;
//		cnt--;
//		if(x==0)x=0;
//		if(x==1)x=1;
//		if(x==2)x=1;
//		x=pibo2(x+1,cnt);
//		return pibo2(x,cnt);
//	}

}
