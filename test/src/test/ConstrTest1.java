package test;

public class ConstrTest1 {
	int numb1;
	String name1;
	int age1;
	
	public ConstrTest1(int numb1) {
		this(numb1,"테스트1",30);
	}
	public ConstrTest1(int numb1,String name1, int age1) {
		this.numb1 = numb1;
		this.name1 = name1;
		this.age1 = age1;
	}
}
