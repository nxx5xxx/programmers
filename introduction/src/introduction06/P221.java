/*안전지대
문제 설명
다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
image.png
지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.

제한사항
board는 n * n 배열입니다.
1 ≤ n ≤ 100
지뢰는 1로 표시되어 있습니다.
board에는 지뢰가 있는 지역 1과 지뢰가 없는 지역 0만 존재합니다.
입출력 예
board	result
[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]	16
[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]	13
[[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]]	0
입출력 예 설명
입출력 예 #1

(3, 2)에 지뢰가 있으므로 지뢰가 있는 지역과 지뢰와 인접한 위, 아래, 좌, 우, 대각선 총 8칸은 위험지역입니다. 따라서 16을 return합니다.
입출력 예 #2

(3, 2), (3, 3)에 지뢰가 있으므로 지뢰가 있는 지역과 지뢰와 인접한 위, 아래, 좌, 우, 대각선은 위험지역입니다. 따라서 위험지역을 제외한 칸 수 13을 return합니다.
입출력 예 #3

모든 지역에 지뢰가 있으므로 안전지역은 없습니다. 따라서 0을 return합니다.


 */
package introduction06;

public class P221 {
    public int solution(int[][] board) {
        int answer = board.length * board[board.length-1].length;
        //0일땐+0 정상 -1 (ileftswitch)
        int ilsw = 0,jlsw = 0;
        //우측벽이 막혀있다면 +0 안막혀있다면 +1 irightswitch
        int irsw = 0,jrsw = 0;
        
        for(int i=0;i<board.length;i++){
            if(i==0){
                ilsw=0;
            }else if(i>0){
                ilsw=-1;
            }
            
            if(i<board.length-1){
                irsw=1;
            }else if(i==board.length-1){
                irsw=0;
            }
            
            for(int j=0;j<board[i].length;j++){
                if(j==0){
                    jlsw=0;
                }else if(j>0){
                    jlsw=-1;
                }
                
                if(j<board[i].length-1){
                    jrsw=1;
                }else if(j==board[i].length-1){
                    jrsw=0;
                }
                
                //지뢰발견
                if(board[i][j]==1){
                    board[i][j]=3;
                    for(int x=i+ilsw;x<=i+irsw;x++){
                        for(int y=j+jlsw;y<=j+jrsw;y++){
                            if(board[x][y]==0){
                                board[x][y] = 3;
                            }
                        }
                    }
                    
                }
            }
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]);
                if(board[i][j]==3){
                    answer--;
                }
            }
            System.out.println("");
        }
        
        return answer;
    }
}