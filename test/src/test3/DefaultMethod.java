package test3;

public interface DefaultMethod {
	int one = 1;
	int two = 2;
	
	void setNumb(int numb);
	
	public default void setNumber(int number) {
		if(number==1) {
			System.out.println("숫자1입니다");
		}else {
			System.out.println("숫자2입니다");
		}
	}
}
