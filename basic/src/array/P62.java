/*

왼쪽 오른쪽
문제 설명
문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다. str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를, 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요. "l"이나 "r"이 없다면 빈 리스트를 return합니다.

제한사항
1 ≤ str_list의 길이 ≤ 20
str_list는 "u", "d", "l", "r" 네 개의 문자열로 이루어져 있습니다.
입출력 예
str_list	result
["u", "u", "l", "r"]	["u", "u"]
["l"]	[]
입출력 예 설명
입출력 예 #1

"r"보다 "l"이 먼저 나왔기 때문에 "l"의 왼쪽에 있는 문자열들을 담은 리스트인 ["u", "u"]를 return합니다.
입출력 예 #2

"l"의 왼쪽에 문자열이 없기 때문에 빈 리스트를 return합니다.

 */
package array;

public class P62 {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int i=0;
        int sw=3;//0은왼쪽 1은오른쪽
        for(;i<str_list.length;i++){
            if(str_list[i].equals("l")){
                sw=0;
                break;
            }
            if(str_list[i].equals("r")){
                sw=1;
                break;
            }
        }
        System.out.println(i);
        if(sw==0){
             answer = new String[i];
            //오른쪽담기안함
            for(int j=0;j<i;j++){
                answer[j] = str_list[j];
            }
        }else if(sw==1){
            answer = new String[str_list.length-i-1];
            //오른쪽담기안함
            for(int j=i+1,y=0;j<str_list.length;j++,y++){
                answer[y] = str_list[j];
            }
        }

        
        return answer;
    }
}