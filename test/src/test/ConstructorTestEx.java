package test;

public class ConstructorTestEx {

	public static void main(String[] args) {
		ConstructorTest1 ct = new ConstructorTest1();
		ct.numb1 = 100;
		ct.str1 = "테스트1";
		System.out.println(ct.numb1);
		System.out.println(ct.str1);
		
		ConstructorTest1 ct2 = new ConstructorTest1(200);
		System.out.println(ct2.numb1);
		System.out.println(ct2.str1);
	}

}
