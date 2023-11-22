package test;

public class PibonachiTest {

	public static void main(String[] args) {
		long cnt = 0;
		for(int i=0,j=1;i<400||j<400;){
			if(i<400)System.out.println(i);
			if(j<400)System.out.println(j);
			i+=j;
			j+=i;
		}
	}

}
