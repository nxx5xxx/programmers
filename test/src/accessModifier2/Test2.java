package accessModifier2;

import accessModifier.ProtectedTest;

public class Test2 extends ProtectedTest{	
	public static void main(String[] args) {
		Test2 pt = new Test2();
		System.out.println(pt.protectedTest);
		
		
		//private는 상속받건말건 못씀 그래서 게터랑 세터로 사용하는것 
	}

}
