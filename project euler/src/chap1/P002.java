package chap1;

public class P002 {

	public static void main(String[] args) {
		long cnt = 0;
		for(long i=1,j=2;i<4000000&&j<4000000;) {
			if(i%2==0)cnt+=i;
			if(j%2==0)cnt+=j;
			i+=j;
			j+=i;
		}
		System.out.println("cnt값 : "+cnt);
	}

}
