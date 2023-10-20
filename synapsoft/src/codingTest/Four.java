package codingTest;

public class Four {

	public static void main(String[] args) {
	long numb = 100000000;
	String result = "";
		while(true) {
			result+=(char)(('A'-1)+numb%26)+"";
			if(numb/26==0) {
				break;
			}else {
				numb/=26;
			}
		}
		System.out.println(new StringBuffer(result).reverse());
	}

}
