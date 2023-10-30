package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
class Main2 {
	//중복수열 담을그릇
	static List<int[]> list = new ArrayList<>();
	//최대 진행 수 k 의 사이즈를 정해줘야함
	static int[] versus;
	public static void main(String[] args) throws Exception {
		long beforeTime = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		/*
		내구슬n, 상대구슬m, 최대진행횟수k
		둘중 한명이 모든 구슬을 잃을 수 있는 경우의 수
		중복수열을 만들고 그 값에서 갖고와야 할것같다
		*/
		// 키보드로 입력받은값 스페이스바 기준으로 나눠서 int타입으로 저장
		String[] str_arr = input.split(" ");
		int[] arr = new int[3];
		for(int i = 0;i<str_arr.length;i++)arr[i]=Integer.parseInt(str_arr[i]);
		int n = arr[0],m = arr[1], k = arr[2];
		
		//최대 k번의 배열
		versus = new int[k];
		//경우의수 전체 재귀함수(0,k)
		numberOfCases(0,k);
	  //패패무승무 패패승패승 같이 이미 0점 이후의 값들을 해쉬셋으로 합쳐버리자
		// n플레이어(구름이)
		HashSet<String> n_set = new HashSet<>();
		// m플레이어(상대방)
		HashSet<String> m_set = new HashSet<>();
		
			for(int i=0;i<list.size();i++){
				int n_score = n;
				String n_str = "";
				int m_score = m;
				String m_str = "";
				//n의 구슬 모두 잃는경우
				for(int j=0;j<k;j++){
					n_score+= list.get(i)[j];
					n_str += list.get(i)[j]+"";
					if(n_score==0){
						n_set.add(n_str);
						break;
					}
				}
				for(int j=0;j<k;j++){
					m_score +=list.get(i)[j];
					m_str += list.get(i)[j]+"";
					if(m_score==0){
						m_set.add(m_str);
						break;
					}
				}
			}
		
		System.out.println(n_set.size()+m_set.size());
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long diffTime = afterTime - beforeTime; // 두 개의 실행 시간
		System.out.println("실행 시간(ms): " + diffTime); // 세컨드(초 단위 변환)
	}
	//반복문으로 안되니 재귀함수 이용해서 최대횟수에 따른 반복작업하기
	static void numberOfCases(int numb, int arr_size){
		// arr_size = k , numb는 for문에서 index처럼 활용할것
		if(numb==arr_size){
			int[] tmp = versus.clone();
			list.add(tmp);
			return ;
		}
		// 패-1 무 0 승 1 다시 호출해서 넣기
		for(int i=-1;i<=1;i++){
			versus[numb] = i;
			numberOfCases(numb+1,arr_size);
		}
	}
}