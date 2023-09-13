/*평행
문제 설명
점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.

[[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.

제한사항
dots의 길이 = 4
dots의 원소는 [x, y] 형태이며 x, y는 정수입니다.
0 ≤ x, y ≤ 100
서로 다른 두개 이상의 점이 겹치는 경우는 없습니다.
두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요.
임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.
입출력 예
dots	result
[[1, 4], [9, 2], [3, 8], [11, 6]]	1
[[3, 5], [4, 1], [2, 4], [5, 10]]	0
입출력 예 설명
입출력 예 #1

점 [1, 4], [3, 8]을 잇고 [9, 2], [11, 6]를 이으면 두 선분은 평행합니다.
입출력 예 #2

점을 어떻게 연결해도 평행하지 않습니다.
※ 공지 - 2022년 9월 30일 제한 사항 및 테스트 케이스가 수정되었습니다.
※ 공지 - 2022년 10월 27일 제한 사항 및 테스트 케이스가 수정되었습니다.
※ 공지 - 2023년 2월 14일 테스트 케이스가 수정되었습니다.


 */
package introduction06;

public class P223 {
    public int solution(int[][] dots) {
        
        int answer = 0;
        // y=a+bx b가 기울기 a는 위아래위위아래
        // b가 같아야 평행일거다 (아마도)
        // b를 구하려면 x값끼리 빼고 y끼리빼고  y/x형태로 나누면 기울기가된다
        
        //1) 배열이 총 4개의 길이니까 두개씩 짝을 지어서 계산해야한다
        //   2개씩 짝을 지을수 있는 경우의수
        //   ab-cd ac-bd ad-bc
        //   기울기는 분수로나올수도 있으니까 더블쓰자
        float ab = ((float)dots[1][1]-dots[0][1])/((float)dots[1][0]-dots[0][0]);
        float cd = ((float)dots[3][1]-dots[2][1])/((float)dots[3][0]-dots[2][0]);
        answer = ab==cd? 1:answer;
        
        float ac = ((float)dots[2][1]-dots[0][1])/((float)dots[2][0]-dots[0][0]);
        float bd = ((float)dots[3][1]-dots[1][1])/((float)dots[3][0]-dots[1][0]);
        answer = ac==bd? 1:answer;
        
        float ad = ((float)dots[3][1]-dots[0][1])/((float)dots[3][0]-dots[0][0]);
        float bc = ((float)dots[2][1]-dots[1][1])/((float)dots[2][0]-dots[1][0]);
        answer = ad==bc? 1:answer;
        
        return answer;
    }
}