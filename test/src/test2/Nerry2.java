package test2;

import java.time.LocalTime;
import java.util.Scanner;

public class Nerry2 {
	static int hour ;
	static int minute;
	static int second;
	
	public static void main(String[] args) {
		// 시분초 + 초 더해서 시분초 만드는 메소드 구현
		//현재시간 근데 안쓸것같음
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 입력하세요");
		hour = sc.nextInt();
		System.out.println("분을 입력하세요");
		minute = sc.nextInt();
		System.out.println("초를 입력하세요");
		second = sc.nextInt();
		System.out.println("더할 초를 입력하세요");
		long tmp_second = sc.nextInt();
		//System.out.println(plusSecond(tmp_second));
		System.out.println(plusSecond2(tmp_second));
		
		sc.close();
	}
	//방법1
	static String plusSecond(long tmp_second) {
		long time_second = hour*60*60 + minute*60 + second + tmp_second;
		hour = (int)time_second/(60*60);
		minute = (int)(time_second-hour*60*60)/60;
		second = (int)time_second%60;
		hour%=24;
		String time = hour+"시"+minute+"분"+second+"초";
		return time;
	}
	
	//방법2
	static String plusSecond2(long tmp_second) {
		second+=tmp_second;
		if(second>=60) {
			minute += second/60;
			second%=60;
		}
		if(minute>=60) {
			hour += minute/60;
			minute%=60;
		}
		if(hour>=24) {
			hour%=24;
		}
		String time = hour+"시"+minute+"분"+second+"초";
		return time;
	}
	
}
