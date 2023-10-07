/*

무작위로 K개의 수 뽑기
문제 설명
랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다. 적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후, 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.

이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.

정수 배열 arr가 주어집니다. 문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때, 완성될 배열을 return 하는 solution 함수를 완성해 주세요.

단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.

제한사항
1 ≤ arr의 길이 ≤ 100,000
0 ≤ arr의 원소 ≤ 100,000
1 ≤ k ≤ 1,000
입출력 예
arr	k	result
[0, 1, 1, 2, 2, 3]	3	[0, 1, 2]
[0, 1, 1, 1, 1]	4	[0, 1, -1, -1]
입출력 예 설명
입출력 예 #1

앞에서부터 서로 다른 k개의 수를 골라내면 [0, 1, 2]가 됩니다. 따라서 [0, 1, 2]를 return 합니다.
입출력 예 #2

서로 다른 수의 개수가 2개 뿐이므로 서로 다른 수들을 앞에서부터 차례대로 저장한 [0, 1]에서 이후 2개의 인덱스를 -1로 채워넣은 [0, 1, -1, -1]을 return 합니다.

 */
package array2;

import java.util.ArrayList;
import java.util.List;

public class P94 {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        String good = "";
        for(int i=0;i<arr.length&&list.size()<k;i++){
            if(good.indexOf("-"+arr[i]+"-")==-1){
                list.add(arr[i]);
                good = good +"-"+ arr[i] +"-"; 
            }
        }
        if(list.size()!=k){
            while(list.size()!=k){
                list.add(-1);
            }
        }
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        System.out.println(good);
        return answer;
    }
}