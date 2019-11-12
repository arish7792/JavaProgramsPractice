package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Node4 {
	
	Node4 left;
	Node4 right;
	int data;
	
	Node4(int data){
		this.left = null;
		this.right = null;
		this.data = data;
	}
	
	public static void levelOrder(Node4 root) {
		Queue<Node4> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
		if(queue.peek().left!=null) {
			queue.add(queue.peek().left);
			}
		if(queue.peek().right!=null) {
			queue.add(queue.peek().right);
			}
		
			Node4 a = queue.poll();
			System.out.println(a.data);
		}
		
	}
	
	public static int height(Node4 root) {
		int left,right;
		if(root==null) {
			return 0;
		}
		else {
			 left = height(root.left);
			 right = height(root.right);
		}
		
		if(right>left) {
			return right+1;
		}
		else {
			return left+1;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node4 root = new Node4(1);
		root.left = new Node4(2);
		root.left.left = new Node4(4);
		root.left.right = new Node4(5);
		root.right = new Node4(3);
		root.right.left = new Node4(6);
		root.right.left.left = new Node4(8);
		root.right.right = new Node4(7);

		//levelOrder(root);
		System.out.println(height(root));
	}

}
