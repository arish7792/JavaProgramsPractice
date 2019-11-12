package practice;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class LRUCache {
	
	public static void add(int a, Deque<Integer> queue, Set<Integer> set) {
		if(set.size()<3) {
			if(!set.contains(a)) {
				set.add(a);
				queue.addFirst(a);
			}
			else {
				queue.remove(a);
				queue.addFirst(a);
			}
		}
		else {
			if(!set.contains(a)) {
				set.remove(queue.poll());
				set.add(a);
				queue.addFirst(a);	
			}
			else {
				queue.remove(a);
				queue.addFirst(a);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> queue = new LinkedList<>();
		Set<Integer> set = new HashSet<>();
		add(1,queue,set);
		add(2,queue,set);
		add(3,queue,set);
		add(4,queue,set);
		add(1,queue,set);
		add(2,queue,set);
		add(5,queue,set);
		add(1,queue,set);
		add(2,queue,set);
		add(3,queue,set);
		add(4,queue,set);
		add(5,queue,set);
		
		Stack<Integer> stack = new Stack<Integer>();
		while(!queue.isEmpty()) {
			stack.push(queue.poll());
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
		

	}

}
