package codingTest;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
/*우리말을 쓰는 평범한 사람이라면 1억원 1조원을 일억원, 일조원이라 하지 억원, 조원이라 읽지는 않습니다. 반면에 1만원, 1천원, 1백원의 경우는 일만원, 일천원, 일백원이라 하지 않고 만원, 천원, 백원, 십원이라 읽습니다. 또한 '80,270원'처럼 금액의 표기는 천단위로 콤마를 찍지만 실제로 읽을 때는 '팔만 이백칠십원'처럼 만단위로 분리하여 읽습니다.

"배조스님의 계좌에서 사이냅소프트님의 계좌로 일조 사천 일백 팔십 오억 원을 이체합니다. 동의하시면 1번을..."

계좌이체 음성안내의 부자연스러운 금액 표현과 띄어읽기가 거슬렸던 암아존 배조스씨를 위해 이체금액을 한글로 자연스럽게 읽을 수 있는 프로그램을 작성해서 보내주세요 작성하세요. 프로그래밍 언어는 가장 자신있는 것을 사용하세요.

입력
암아존 배조스님의 은행 이체한도는 100조원으로 설정돼 있으므로 입력 금액의 범위는 1원에서 100조원까지입니다.
모든 금액은 천단위 구분자인 콤마가 표시돼있고 금액단위인 원으로 끝납니다.
예로 아래와 같은 입력이 가능하고 입력은 별도 파일에서 읽어와도 되고, 소스코드안에 포함시켜도 됩니다.
물론 UI를 만들어 사용자로부터 직접 입력 받아도 좋습니다.*/
		//long 범위 9,223,372,036,854,775,807 --> 100조 가능
			
//		1원
//		80,270원
//		111,111원
//		1,234,567,890원
//		100,000,000,000,000원
		long synapsoft = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
		
		
		System.out.println("금액을 입력해 주세요 (예 : 111,111원 ), exit를 치면 종료됩니다");
		
		String input_won = sc.nextLine();
		//숫자는 4개씩 돌고 4개가 넘어가면 만 억 조 로 바뀐다
		//단 억 전에는 1만원 1천원 식으로 표현을 쓰지않는다
		if(input_won.equals("exit"))break;
		
		// , 을 다지워버리고 진행
		long long_won = Long.parseLong((input_won.replaceAll(",", "").replaceAll("원", "")));
		DecimalFormat df = new DecimalFormat("#,####");
		//4개 단위로 끊어서 읽어줘야한다 split으로 배열로 나누자
		String[] dv_arr = df.format(long_won).split(",");
		String[] result = new String[dv_arr.length];
		//null로 초기화되므로 공백으로 초기화
		for(int i=0;i<result.length;i++)result[i]="";
		
		//나눈것에 숫자로 변환
		//숫자 임시저장
		String tmp = "";
		for(int i=0;i<dv_arr.length;i++) {
			for(int j=0;j<dv_arr[i].length();j++) {
				//숫자,자리수,단 21만은 이십일만 으로 부르고 1원의경우도 일원으로 부르므로 그경우를 생각해서 뒤에 두개 추가
				tmp=transKor(dv_arr[i].charAt(j)+"",dv_arr[i].length()-j,dv_arr.length,dv_arr[i].length());
				if(dv_arr[i].charAt(j)!='0')tmp+=plusDanwe(dv_arr[i].length()-j);
				result[i]+=tmp;
			}
			//임시저장 초기화
			tmp = "";
			
			result[i]+=unitDanwe(dv_arr.length-i,dv_arr[i]);
		}
		

		//어절검사
		int cnt = 0;
		int kor = 0;
		for(int i=0;i<result.length;i++) {
			if(result[i].replaceAll("원", "").length()>0) {
				cnt++;
				kor += result[i].replaceAll("원", "").length();
			}
		}
		kor++;
//		System.out.println(Arrays.toString(result));
		String output = "";
		if(result[result.length-1].length()>1) {
			for(String data : result)output+=data+" ";
		}else {
			for(String data : result)output+=data+" ";
			output = output.replaceAll("[ ]*원", "원");
		}
		System.out.println(output);
		System.out.println(cnt+"어절");
		System.out.println(kor+"한글");
		System.out.println("곱한 값 : "+cnt*kor);
		synapsoft += cnt*kor;
		}
		
		sc.close();
		System.out.println("모든 값의 총 합 "+ synapsoft);
	}
	
	//숫자반환 메서드
	static String transKor(String numb,int sw,int a,int b){
		if(numb.equals("1") && sw==1) {
			// 1이고 자리수가 만의 자리수일경우
			// 만단위에 일만이 다른것과 존재할때는 일만 이지만 홀로 1만으로 존재할땐 만으로 불림 억의경우도 마찬가지
			if(a==2 && b<=1) {
				return "";
			}
			return "일";
		}else if(numb.equals("2")) {
			return "이";
		}else if(numb.equals("3")) {
			return "삼";
		}else if(numb.equals("4")) {
			return "사";
		}else if(numb.equals("5")) {
			return "오";
		}else if(numb.equals("6")) {
			return "육";
		}else if(numb.equals("7")) {
			return "칠";
		}else if(numb.equals("8")) {
			return "팔";
		}else if(numb.equals("9")) {
			return "구";
		}else {
			return "";
		}
		
	}
	// 일단위반환 메서드
	static String plusDanwe(int x) {
		if(x==4) {
			return "천";
		}else if(x==3) {
			return "백";
		}else if(x==2) {
			return "십";
		}
		return "";
	}
	
	// 천단위반환 메서드
	static String unitDanwe(int y,String conv) {
		int tmp = 0;
		//아무것도 안쓰여있을때는 조 억 만 원을 반환해주면 안된다
		tmp = Integer.parseInt(conv);
		if(y==4 && tmp>0) {
			return "조";
		}else if(y==3 && tmp>0) {
			return "억";
		}else if(y==2 && tmp>0) {
			return "만";
		}else if(y==1) {
			return "원";
		}
		return "";
	}
}
