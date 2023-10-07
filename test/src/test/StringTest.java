package test;

public class StringTest {

	public static void main(String[] args) {
		long st,ed,time = 0;
		String[] str = new String[30];
		for(int i=0;i<30;i++) {
			str[i] = i+""+i;
		}
		
		//속도측정1
		st=System.nanoTime();
		for(int i=0;i<30;i++) {
			str[i] += str[i];
		}
		ed=System.nanoTime();
		time=ed-st;
		System.out.println("문자열에 같은 문자열 더했을때 속도");
		System.out.println("속도 : "+time);
		
		//초기화
		for(int i=0;i<30;i++) {
			str[i] = i+""+i;
		}
	}

}
