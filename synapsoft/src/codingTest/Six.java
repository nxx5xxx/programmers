package codingTest;

public class Six {

	public static void main(String[] args) {
		long cnt = 0;
		for(long i=1,j=2;i<99987654321l&&j<99987654321l;) {
			if(i<12345678999l)cnt+=i;
			if(j<12345678999l)cnt+=j;
			i+=j;
			j+=i;
			System.out.println(i);
			System.out.println(cnt);
		}
		System.out.println("cnt값 : "+cnt);
	}

}
