package queue;

import java.util.PriorityQueue;

public class PriorityQueueEx2 {

	public static void main(String[] args) {
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			int tmp_pq =0;
			
			pq.add(10);
			pq.add(10);
			pq.add(2);
			pq.add(5);
			pq.add(3);
			
			tmp_pq = pq.poll()+pq.poll();
			System.out.println(tmp_pq);
			
			pq.add(tmp_pq);
			pq.add(tmp_pq);
			
			tmp_pq = pq.poll()+pq.poll();
			System.out.println(tmp_pq);
	}

}

