/*A로 B 만들기
문제 설명
문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < before의 길이 == after의 길이 < 1,000
before와 after는 모두 소문자로 이루어져 있습니다.
입출력 예
before	after	result
"olleh"	"hello"	1
"allpe"	"apple"	0
입출력 예 설명
입출력 예 #1

"olleh"의 순서를 바꾸면 "hello"를 만들 수 있습니다.
입출력 예 #2

"allpe"의 순서를 바꿔도 "apple"을 만들 수 없습니다.


 */
package introduction05;

import java.util.HashMap;

public class P188 {
    public int solution(String before, String after) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<before.length();i++){
            if(map.get(before.charAt(i))==null){
                map.put(before.charAt(i),1);
            }else{
                map.put(before.charAt(i),map.get(before.charAt(i))+1);
            }
        }
        
        for(int i=0;i<after.length();i++){
            if(map.get(after.charAt(i))==null){
                return 0;
            }else if(map.get(after.charAt(i))>1){
                map.put(after.charAt(i),map.get(after.charAt(i))-1);
            }else if(map.get(after.charAt(i))==1){
                map.remove(after.charAt(i));
            }
        }
        int answer = 1;
        return answer;
    }
}