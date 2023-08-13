package queue;

import java.util.PriorityQueue;

public class PriorityQueueEx3 {

	public static void main(String[] args) {
		int number = 2;
		int[] ability = {10,3,7,2};
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<ability.length;i++){
                pq.add(ability[i]);
        }
        for(int j=0;j<number;j++){
            answer = pq.poll()+pq.poll();
            pq.add(answer);
            pq.add(answer);
           
        }
        
        answer=0;
        for(;0<pq.size();){
            answer+=pq.poll();
        }
        System.out.println(answer);
	}

}

