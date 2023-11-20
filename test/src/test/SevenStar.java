package test;

public class SevenStar {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<i*2+1;j++) {
				System.out.printf("%s","*");
			}
			System.out.println();
		}

	}

}
