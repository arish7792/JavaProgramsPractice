package practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Node6 {
		
		Node6 left;
		Node6 right;
		int data;
		
		Node6(int data){
			this.left = null;
			this.right = null;
			this.data = data;
		}
		
		
		
		public static void flatten(Node6 root, Stack<Integer> stack) {
			if(root==null) {
				return;
			}
			
			stack.push(root.data);
			flatten(root.left,stack);
			flatten(root.right,stack);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node6 root = new Node6(1);
		root.left = new Node6(2);
		root.right = new Node6(3);
		root.left.left = new Node6(4);
		root.left.right = new Node6(5);
		Stack<Integer> stack = new Stack<Integer>();
		
		flatten(root,stack);		
		System.out.println(stack);
		
		
		List<Integer> list = new LinkedList();
		while(!stack.isEmpty()) {
			list.add(stack.pop());
		}
		
		System.out.println(list);
		
//		
//		while(node1!=null) {
//			System.out.println(node.data);
//			node1 = node1.next;
//		}
	}

}
