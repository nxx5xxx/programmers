package test;

import java.util.Arrays;

public class ProgremersTest {

    public String[] solution(String[] commands) {
        String[] answer = {};
        /*
        50*50고정 모든셀 null
        셀은 문자열값을 가질수 있음
        커맨드는 1000개까지 - 예제는 x y 위치 다름 세로 가로 기준임
        update 세로 가로 머시기 y,x의 값을 머시기로 바꿈
        update 값1 값2 값1을 값2로 바꿈
        merge r1 c1 r2 c2 y,x와 뒤에 y,x의 값을 합함 (선택한 셀의 같은 좌표일경우 무시)
            - 머지로 합한경우 1번째 좌표값의 위치로 값을 가지게됨
            단, 2번째 좌표값에 접근하여도 1번좌표의 위치가나옴 뭐고십
        unmerge r c 해당 좌표 합친거 풀기
            - 프로그램 실행초기가 뭔말이고 - 실행초기는 빈값
오브젝트 배열로 하는게 나을듯
    그냥 주소 참조해올수있게 하면 좋을거같은데
    String obb = new String("거시기");
    String odd = obb 이렇게하면 주소복사될듯 그럼그냥 오브젝트배열말고 걍배열 ㄱ
    이거안됨
    방법 있을거같은데 뭐지 포인터 사용방법 * 였나
    StringBuilder
        */
        //5050배열초기화
        // String[][] arr = new String[50][50];
        StringBuilder[][] arr = new StringBuilder[50][50];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(arr[i],new StringBuilder(""));
        }
        //만일 메모리시간 너무 잡아먹으면 다 null처리로하고 print부분 empty도 null로
        //커맨드 나누기
        String[][] co_tmp = new String[commands.length][];
        for(int i=0;i<co_tmp.length;i++)co_tmp[i]=commands[i].split(" ");
        
        /*
            Update 4,3
            Merge 5
            Unmerge 2
            print 2
        */
        //하나씩 꺼내서 넣어보기
        for(int i=0;i<co_tmp.length;i++){
            //for(int j=1;j<co_tmp[i].length;j++){
                //System.out.println(co_tmp[i][j]);
                //맨 앞 update, merge, unmerge, print 판단
        	
        switch(co_tmp[i][0]){//이중포문 쓸필요가있나..?
            case "UPDATE" :
                if(co_tmp[i].length==4){
                    int idx1 = Integer.parseInt(co_tmp[i][1]),idx2 = Integer.parseInt(co_tmp[i][2]);
                    //if(arr[idx1][idx2].indexOf("MERGE")>-1){
                        // int tmp1 = Integer.parseInt(arr[idx1][idx2].substring(arr[idx1][idx2].indexOf("-")+1,arr[idx1][idx2].lastIndexOf("-")));
                    //}else{
                    // arr[Integer.parseInt(co_tmp[i][1])][Integer.parseInt(co_tmp[i][2])] =
                    //     co_tmp[i][3];
                    //}
                     //머지부분을 해결하기위해 스트링빌더로 다시진행
                    if(arr[idx1][idx2].toString().equals("")){
                        arr[idx1][idx2]=new StringBuilder(co_tmp[i][3]);
                    }else{
                        arr[idx1][idx2].replace(0,arr[idx1][idx2].length(),co_tmp[i][3]);
                    }
                }else{
                    for(int x=0;x<50;x++){
                        for(int y=0;y<50;y++){
                             if(arr[x][y].toString().equals(co_tmp[i][1])){
                                 arr[x][y]=arr[x][y].replace(0,arr[x][y].length(),co_tmp[i][2]);
                             }
                        }
                    }
                }
                break;
            case "MERGE" :{
                int idx1 = Integer.parseInt(co_tmp[i][1]),idx2 = Integer.parseInt(co_tmp[i][2]),
                    idx3 = Integer.parseInt(co_tmp[i][3]),idx4 = Integer.parseInt(co_tmp[i][4]);
                // arr[Integer.parseInt(co_tmp[i][3])][Integer.parseInt(co_tmp[i][4])] =
                //     "MERGE-"+co_tmp[i][1]+"-"+co_tmp[i][2];
                //스트링빌더로 바꾼 후
                if(idx1!=idx3&&idx2!=idx4){
                    if(arr[idx1][idx2].toString().equals("")){
                        arr[idx1][idx2]=arr[idx3][idx4];
                    }else{
                        arr[idx3][idx4]=arr[idx1][idx2];
                    }
                }
                break;
            }
            case "UNMERGE":{
                int idx1 = Integer.parseInt(co_tmp[i][1]),idx2 = Integer.parseInt(co_tmp[i][2]);
                for(int x=0;x<50;x++){
                        for(int y=0;y<50;y++){
                             if(arr[idx1][idx2]==arr[x][y] && (x!= idx1 && y!=idx2)){
                                 arr[x][y]=new StringBuilder("");
                             }
                        }
                    }
            break;
            }
            case "PRINT" :
                int idx1 = Integer.parseInt(co_tmp[i][1]),idx2 = Integer.parseInt(co_tmp[i][2]);
                System.out.println(arr[idx1][idx2].toString());
                break;
        }
            //}
        }
        return answer;
    }
}
