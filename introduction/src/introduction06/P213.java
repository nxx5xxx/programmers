/*문자열 밀기
문제 설명
문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < A의 길이 = B의 길이 < 100
A, B는 알파벳 소문자로 이루어져 있습니다.
입출력 예
A	B	result
"hello"	"ohell"	1
"apple"	"elppa"	-1
"atat"	"tata"	1
"abc"	"abc"	0
입출력 예 설명
입출력 예 #1

"hello"를 오른쪽으로 한 칸 밀면 "ohell"가 됩니다.
입출력 예 #2

"apple"은 몇 번을 밀어도 "elppa"가 될 수 없습니다.
입출력 예 #3

"atat"는 오른쪽으로 한 칸, 세 칸을 밀면 "tata"가 되므로 최소 횟수인 1을 반환합니다.
입출력 예 #4

"abc"는 밀지 않아도 "abc"이므로 0을 반환합니다.
※ 공지 - 2023년 4월 24일 테스트케이스가 추가되었습니다. 기존에 제출한 코드가 통과하지 못할 수도 있습니다.


 */
package introduction06;

public class P213 {
    public int solution(String A, String B) {
        int answer = 0;
        //오른쪽으로돌리기
        while(!A.equals(B)){
            //맨우측꺼 뺴서 맨 앞으로반복
            //한번반복할때마다  answer++;
            A = A.charAt(A.length()-1) +A.substring(0,A.length()-1);
            answer++;
            if(answer>B.length()){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}