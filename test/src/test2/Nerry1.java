package test2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Nerry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10000 으로 입력해도 10,000처럼 1,000단위 구분해서 출력되는 프로그램 작성, 
		 * 시분초 + 초 더해서 시분초 만드는 메소드 구현, 
		 * 사원,팀,급여 관리할 수 있는 논리적 모델 설계, 3에서 작성한 걸로 개발팀 홍길동 사원의 2022년 하반기 급여 합계 조회 쿼리
		 */
		Scanner sc = new Scanner(System.in);
		long numb1 = sc.nextLong();
		System.out.printf("%,d \n", numb1);
		//또는
		// 단 아래것은 String으로 반환함
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(numb1));
		sc.close();
	}

}
