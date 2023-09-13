/*구슬을 나누는 경우의 수
문제 설명
머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

제한사항
1 ≤ balls ≤ 30
1 ≤ share ≤ 30
구슬을 고르는 순서는 고려하지 않습니다.
share ≤ balls
입출력 예
balls	share	result
3	2	3
5	3	10
입출력 예 설명
입출력 예 #1

서로 다른 구슬 3개 중 2개를 고르는 경우의 수는 3입니다. 스크린샷 2022-08-01 오후 4.15.55.png
입출력 예 #2

서로 다른 구슬 5개 중 3개를 고르는 경우의 수는 10입니다.
Hint
서로 다른 n개 중 m개를 뽑는 경우의 수 공식은 다음과 같습니다. 스크린샷 2022-08-01 오후 4.37.53.png
※ 공지 - 2022년 10월 11일 제한 사항 및 테스트케이스가 수정되었습니다.


 */
package introduction06;

import java.math.BigInteger;

public class P202 {
    public int solution(int balls, int share) {
        //일반 int로 사용하면 팩토리얼의 범위가 넘어간다 그래서 작성한거 다 BigInteger로 바꿈
        //n팩
        //int n=1;
        BigInteger n = new BigInteger("1");
        BigInteger ii = new BigInteger("0");
        for(int i=n.intValue();i<=balls;i++){
            ii = BigInteger.valueOf(i);
            n=n.multiply(ii);
        }
        
        //n-m팩
        //int n_m=1;
        BigInteger n_m = new BigInteger("1");
        for(int i=n_m.intValue();i<=balls-share;i++){
            ii = BigInteger.valueOf(i);
            n_m=n_m.multiply(ii);
        }
        //m팩
        //int m=1;
        BigInteger m = new BigInteger("1");
        for(int i=m.intValue();i<=share;i++){
            ii = BigInteger.valueOf(i);
            m=m.multiply(ii);
        }
        return n.divide(n_m.multiply(m)).intValue();
    }
}