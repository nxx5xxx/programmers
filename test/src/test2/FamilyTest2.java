package test2;

public class FamilyTest2 {

	public static void main(String[] args) {
		SonTest son = new SonTest("카레","밀감","떡복이");
		System.out.println("sonTest");
		  method(son);
		  
		ParentsTest parentsTest = new ParentsTest("카레");
		System.out.println("parentsTest");
		  method(parentsTest);
	}
	public static void method(ParentsTest parent) {
		if(parent instanceof SonTest){
			System.out.println("true");
			SonTest child = (SonTest) parent;  
			}else {
				System.out.println("false");
			}
	}

}
