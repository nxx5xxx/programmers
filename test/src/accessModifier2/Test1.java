package accessModifier2;

import accessModifier.ProtectedTest;

public class Test1{

	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		//상속받아서 사용가능
//		System.out.println(pt.protectedTest);
//		pt.protectedMethodTest();
		
		//private는 상속받건말건 못씀 그래서 게터랑 세터로 사용하는것 
	}

}
