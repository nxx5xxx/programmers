package test;

public class replaceTest {

	public static void main(String[] args) {
		String str = "Java Java Java";
		String replaceTest = str.replace("Java", "Molba");
		System.out.println(replaceTest);
		
		String replaceAllTest = str.replaceAll("Java", "Molba");
		System.out.println(replaceAllTest);
		
		String replaceFirstTest = str.replaceFirst("Java", "Molba");
		System.out.println(replaceFirstTest);
		
		String str2 = "abcdababcdcdabdc";
		String replaceTest2 = str2.replace("ab", "--");
		System.out.println(replaceTest2);
		
		String replaceAllTest2 = str2.replace("ab", "--");
		System.out.println(replaceAllTest2);
		
		String replaceFirstTest2 = str2.replaceFirst("ab", "--");
		System.out.println(replaceFirstTest2);
		
		
		String replaceOldCharTest = str.replace('a','0');
		System.out.println(replaceOldCharTest);
		
		String numb = "Hello 0123456789";
		String test = numb.replaceAll("[0-9]",""); // [0-9]는 \\d로도 표기가능
		System.out.println(test);
		numb.replace("0", "").replace("1", "");
		
		System.out.println(numb.indexOf("0"));
	}

}
