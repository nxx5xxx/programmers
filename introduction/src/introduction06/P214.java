/*특이한 정렬
문제 설명
정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10,000
1 ≤ numlist의 원소 ≤ 10,000
1 ≤ numlist의 길이 ≤ 100
numlist는 중복된 원소를 갖지 않습니다.
입출력 예
numlist	n	result
[1, 2, 3, 4, 5, 6]	4	[4, 5, 3, 6, 2, 1]
[10000,20,36,47,40,6,10,7000]	30	[36, 40, 20, 47, 10, 6, 7000, 10000]
입출력 예 설명
입출력 예 #1

4에서 가까운 순으로 [4, 5, 3, 6, 2, 1]을 return합니다.
3과 5는 거리가 같으므로 더 큰 5가 앞에 와야 합니다.
2와 6은 거리가 같으므로 더 큰 6이 앞에 와야 합니다.
입출력 예 #2

30에서 가까운 순으로 [36, 40, 20, 47, 10, 6, 7000, 10000]을 return합니다.
20과 40은 거리가 같으므로 더 큰 40이 앞에 와야 합니다.


 */
package introduction06;

public class P214 {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        //1)모든값에서 n빼고 그거의 절대값을 순서대로놓음
        //같은숫자가 2개있을시 걔는 -1을해줌
        //그리고 모든값에서 n을더해줌
        
        //1)
        for(int i=0;i<answer.length;i++){
            answer[i] = numlist[i]-n;
        }
        int data=0;
        for(int i=0;i<answer.length-1;i++){
            for(int j=i+1;j<answer.length;j++){
                if(Math.abs(answer[i])>Math.abs(answer[j])){
                    data = answer[i];
                    answer[i] = answer[j];
                    answer[j] = data;
                }
            }
        }
        //2)
         for(int i=0,j=1;i<answer.length-1;i++,j++){
            if(Math.abs(answer[i])==answer[j]){
                answer[i]*=-1;
                answer[j]*=-1;
            }
         }
        //3)
        for(int i=0;i<answer.length;i++){
            answer[i]+=n;
        }
        return answer;
    }
}