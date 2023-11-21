package test;

public class OperatorTest {

	public static void main(String[] args) {
		int  x=1,y=2;
		int tmp1=1,tmp2=3;
		if(x!=tmp1||y!=tmp2) {
			System.out.println("같은 주소가 아님");
		}else {
			System.out.println("같은 주소임");
		}

	}

}
