/*

콜라츠 수열 만들기
문제 설명
모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고, x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.

그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.

계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.

임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때 초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ n ≤ 1,000
입출력 예
n	result
10	[10, 5, 16, 8, 4, 2, 1]
입출력 예 설명
입출력 예 #1

순서대로 연산한 결과를 표로 만들면 다음과 같습니다.
연산 횟수	x	홀짝 여부
0	10	짝수
1	5	홀수
2	16	짝수
3	8	짝수
4	4	짝수
5	2	짝수
6	1	홀수
따라서 [10, 5, 16, 8, 4, 2, 1]을 return 합니다.

 */
package forEach;

public class P33 {
    public int[] solution(int n) {
        int y=n;
        int cnt=1;
        while(y>1){
            if(y%2==0){
                y/=2;
            }else{
                y=3*y+1;
            }
            cnt++;
        }
        int[] answer = new int[cnt];
        int i = 1;
        answer[0] = n;
        y=n;
        while(i<cnt){
            if(y!=1){
                if(y%2==0){
                    answer[i] = y/2;
                    y/=2;
                  //  System.out.println(i);
                }else{
                    answer[i] =3*y+1;
                    y=3*y+1;
                  //  System.out.println(i);
                }
            }else{
                break;
            }
            i++;
        }
        return answer;
    }
}