package queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		/*
	 	우선순위 큐
	 		1 . null값을 허용하지 않는다
	 		2 . 비교할 수 없는 객체는 큐를 만들 수 없다
	 		3 . 이진트리 힙으로 구성되어 있다
	 		
	 	선언방법 - Integer와 String으로 할 수 있다
	 		1. 낮은숫자 순으로 우선순위
	 		PriorityQueue<Integer> pq = new PriorityQueue<>();
	 		
	 		2. 높은 숫자 순으로 우선순위
	 		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	 		
	 	사용방법
	 		값 추가 - pq.add(숫자또는문자);
	 		값 추가 - pq.offer(숫자또는문자);
	 		
	 		값 갖고온 후 삭제 - pq.poll(); - 우선순위가 가장 높은값 갖고오고 제거한다 
	 		값만 갖고오기 pq.peek();
	 		선언방법 1로 했다면 숫자가 가장 낮은것이 우선순위가 높다
	 		
	 		값 삭제 - pq.remove(); -우선순위가 가장 높은값 제거
	 		pq.remove(인덱스번호); 해당인덱스 순위값을 제거
	 		
	 		값 비우기
	 		pq.clear();
	 */
			
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			pq.add(1);
			pq.add(2);
			pq.add(7);
			pq.add(3);
			pq.add(4);
			pq.add(5);
			pq.add(6);
/*
 			------------------------------
			 1 2 3 4 5 6 7
						1
				2				3
			4		5		6		7
			------------------------------
			1 2 7 3 4 5 6
			
						1
				3				2
			7		4		5		6
			------------------------------
			1 2 7 3 4 5 6
			
						1
				2				5
			3		4		7		6
			------------------------------
			1 2 3 4 7 5 6
			
						1
				2				3
			4		7		5		6
			------------------------------
 
 */
			
			System.out.println(pq);
	}

}
