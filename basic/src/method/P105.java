/*

0 떼기
문제 설명
정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ n_str ≤ 10
n_str이 "0"으로만 이루어진 경우는 없습니다.
입출력 예
n_str	result
"0010"	"10"
"854020"	"854020"
입출력 예 설명
입출력 예 #1

"0010"의 가장 왼쪽에 연속으로 등장하는 "0"을 모두 제거하면 "10"이 됩니다.
입출력 예 #2

"854020"는 가장 왼쪽에 0이 없으므로 "854020"을 return합니다.

 */
package method;

public class P105 {
    public String solution(String n_str) {
        int sw = 0;
        String answer = "";
        for(int i=0;i<n_str.length();i++){
            if(n_str.charAt(i)=='0' && sw==0){
                continue;
            }else{
                sw = 1;
                answer = answer + n_str.charAt(i);
            }
        }
        return answer;
    }
}