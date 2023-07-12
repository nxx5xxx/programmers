/*

정수를 나선형으로 배치하기
문제 설명
양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ n ≤ 30
입출력 예
n	result
4	[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
5	[[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]
입출력 예 설명
입출력 예 #1

예제 1번의 n의 값은 4로 4 × 4 배열에 다음과 같이 1부터 16까지 숫자를 채울 수 있습니다.

행 \ 열	0	1	2	3
0	1	2	3	4
1	12	13	14	5
2	11	16	15	6
3	10	9	8	7
따라서 [[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]를 return 합니다.

입출력 예 #2

예제 2번의 n의 값은 5로 5 × 5 배열에 다음과 같이 1부터 25까지 숫자를 채울 수 있습니다.

행 \ 열	0	1	2	3	4
0	1	2	3	4	5
1	16	17	18	19	6
2	15	24	25	20	7
3	14	23	22	21	8
4	13	12	11	10	9
따라서 [[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]를 return 합니다.

 */
package twoDimensionalArray;

public class P120 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int cnt = 1; //올라가는숫자로할것
        //첫줄은 무조건 시작되고
        //한번 시작돌리면 
        //그 이후칸이 끝에 도착할때마다 칸이 좁아짐
        int sero_start = 0; //좁아질 세로칸
        int sero_last = n-1;
        int garo_start = 0;
        int garo_last = n-1;
        //처음시작
        while(cnt<=n*n){
            // if(cnt>=n*n){
            //     break;
            // }
            for(int i = garo_start ; i<=garo_last ; i++){
                answer[garo_start][i] = cnt;
                cnt ++;
            }
            sero_start++;
            //1~5까지 채워짐
            //이제 아래로
            //시작하는 세로칸이 좁아짐
            // if(cnt>=n*n){
            //     break;
            // }
            for(int i=sero_start;i<=sero_last;i++){
                answer[i][sero_last] = cnt;
                cnt ++;
            }
            garo_last--;
            // if(cnt>=n*n){
            //     break;
            // }
            //왼쪽으로 가는 가로의 시작칸이 좁아짐
            //왼쪽으로 가면서 채울것임
            for(int i=garo_last;i>=garo_start;i--){
                answer[sero_last][i] = cnt;
                cnt ++;
            }
            //세로칸 좁아짐
            sero_last--;
            // if(cnt>=n*n){
            //     break;
            // }
            for(int i=sero_last;i>=sero_start;i--){
                answer[i][garo_start] = cnt;
                cnt++;
            }
            garo_start++;
        }
        
        return answer;
    }
}