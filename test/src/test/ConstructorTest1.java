package test;

public class ConstructorTest1 {
	int numb1;
	String str1;
	public ConstructorTest1() {}
	public ConstructorTest1(int number) {
		numb1 = number;
	}
	public ConstructorTest1(String string) {
		str1 = string;
	}
	public ConstructorTest1(String str1,int number) {
		this.numb1 = number;
		this.str1 = str1;
	}
	public ConstructorTest1(int number, String str1) {
		this.numb1 = number;
		this.str1 = str1;
	}
	
}
