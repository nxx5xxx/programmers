package chap1;

public class P001 {

	public static void main(String[] args) {
		int cnt = 0;
		for(int i=1; i<1000; i++)if(i%3 == 0 || i%5==0)cnt+=i;
		System.out.println(cnt);
	}
}
