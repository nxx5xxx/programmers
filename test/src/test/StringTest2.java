package test;

public class StringTest2 {

	public static void main(String[] args) {
		StringBuilder[][] sb = new StringBuilder[50][50];
		sb[1][1]=new StringBuilder("1234");
		System.out.println(sb[1][1].toString());
		sb[2][1]=sb[1][1];
		sb[3][1]=sb[1][1];
		sb[2][1].append("555");
		System.out.println(sb[1][1].toString());
		sb[1][1].replace(0, sb[1][1].length(), "54321");
		System.out.println(sb[3][1].toString());
		System.out.println(sb[1][1].equals("1234555"));
		System.out.println(sb[1][1]==sb[2][1]);
		System.out.println(sb[1][1]==sb[3][1]);
		System.out.println(sb[2][1]==sb[3][1]);
	}

}
