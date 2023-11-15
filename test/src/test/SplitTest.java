package test;

import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		String str = "A-B-C-D-E-F----";  
		String[] splitStr = str.split("-",5);  
		System.out.println(splitStr[1]);
		System.out.println(Arrays.toString(splitStr));
		
		 String str2 = "도망가-가가각-가가가각-도망가-망가-내게로 부터 멀리";  
		 String[] splitStr2 = str2.split("-");  
		 System.out.println(Arrays.toString(splitStr2));
		 
		 String str3 = "도망가-가가각-가가가각-도망가-망가---";  
		 String[] splitStr3 = str3.split("-");  
		 System.out.println(Arrays.toString(splitStr3));  
	}

}
