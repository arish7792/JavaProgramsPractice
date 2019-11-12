package practice;

import java.util.LinkedList;
import java.util.Queue;

public class stackFromQueue {
	
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();
	
	public static void push(int a) {
		q2.add(a);
		
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		Queue<Integer> temp = new LinkedList<Integer>();
		temp = q2;
		q2 = q1;
		q1 = temp;		
	}
	
	public static void print() {
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
	}
	
	public static void pop() {
		System.out.println(q1.poll());
	}
	

	public static void main(String[] args) {
		
		push(6);
		push(7);
		push(8);
		push(9);
		pop();
		
		

	}

}
