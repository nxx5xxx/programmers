package test3;

public class Subsub {

	static String[][] example = {
			{"baekjoon online judge"},
			{"tag"},
			{"ef gh"},
			{"one1 two2 three3 4fourr 5five 6six"},
			{"< space >space space space< spa c e>"}
			};
	public static void main(String[] args) {
		/*
		{"baekjoon online judge                 "},
		{"tag                                   "},
		{"ef gh                                 "},
		{"one1 two2 three3 4fourr 5five 6six    "},
		{"21474836479223372036854775807         "},
		{"17413problem ever                     "},
		{"< space >space space space< spa c e>  "},
		예제의 출력
		noojkeab enilno egduj
		gat
		fe hg
		1eno 2owt 3eerht rruof4 evif5 xis6
		< space >ecaps ecaps ecaps< spa c e>
		문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
		
		먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.
		
		알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
		문자열의 시작과 끝은 공백이 아니다.
		'<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
		태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다. 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.
		
		입력
		첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.
		
		출력
		첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.
		74638474127085774586302733229 이부분은 오류라 무시 
		*/

		for(int z=0;z<example.length;z++) {
			for(String data : example[z]) {
				System.out.println("테스트 "+(z+1)+" 시작");
				//코드작성부분
//				스트링빌더로 쓰까묵자
				//sw1 은 <>의 판별로
				boolean sw1 = false;
				boolean sw2 = false;
				/* 
				 * 공백이 나오기 전 까지의 String값을 StringBuilder에 담는다
				 * 공백이 나오면 Sb에 담긴 값을 reverse하여 answer값에 더해준다
				 * answer값에 더한 후 Sb값은 초기화해준다
				 * */
				String answer = "";
				StringBuilder sb = new StringBuilder();
				for(int i=0;i<data.length();i++) {
//					{"< space >space space space< spa c e>  "}
					if(data.charAt(i)=='<') {
						sw1 = true;
						if(!sb.toString().equals("")) {
							answer += sb.reverse().toString();
							sb = new StringBuilder();
						}
					}
					
					if(sw1==true) {
						sb.append(data.charAt(i));
						if(data.charAt(i)=='>') {
							answer += sb.toString();
							sw1 = false;
							sb = new StringBuilder();
						}
					}else {
						if(data.charAt(i)!=' ') {
							sb.append(data.charAt(i));
							if(i==data.length()-1)answer += sb.reverse().toString();
						}else if(data.charAt(i)==' ') {
							answer += sb.reverse().toString()+" ";
							sb = new StringBuilder();
						}
					}
				}
				System.out.println(answer);
			}
		}

	}

}

