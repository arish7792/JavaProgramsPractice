package practice;

import java.util.PriorityQueue;

public class moveAllZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,4,3,0,2,0,0,9,1,3,0};
		
			
		PriorityQueue queue = new PriorityQueue<>();
		
		for(int i=0 ;i<a.length; i++) {
			queue.add(a[i]);
		}
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll()+" ");
		}

	}

}
