package test;

public class HashcodeTest {

	public static void main(String[] args) {
		String str = "해쉬코드";
		//identityHashCode는 String의 주소를 리턴 
		System.out.println(System.identityHashCode(str));
		//hashCode는 부모인 Object의 주소를 리턴
		System.out.println(str.hashCode());
		
		
		//이 의미가 아닌거같다
		Object obj = new String("테스트");
		System.out.println(System.identityHashCode(obj));
		System.out.println(obj.hashCode());
		
		//GC(가비지컬렉션에 의해)
	}

}
