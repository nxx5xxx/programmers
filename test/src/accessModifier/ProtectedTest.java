package accessModifier;

public class ProtectedTest {
	protected String protectedTest = "방어된 멤버필드";
	String defaultTest = "기본값 멤버필드";
	private String privateTest = "프리베이트 멤버필드";
	
	protected void protectedMethodTest() {
		System.out.println("프로텍트메소드 실행");
	}
	
	private void privateMethodTest() {
		System.out.println("프리베이트메소드 실행");
	}

}
