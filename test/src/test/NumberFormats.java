package test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormats {

	public static void main(String[] args) {

		
		//데시말포맷
		DecimalFormat df = new DecimalFormat("#,###");
		long number = 111222333;
		
		System.out.println(df.format(number));
		
		//프린트f
		System.out.printf("%,d \n",number);
		
		//넘버포맷 겟인스턴스조합
		String str_numb = NumberFormat.getInstance().format(number);
		System.out.println(str_numb);
		
	}

}
