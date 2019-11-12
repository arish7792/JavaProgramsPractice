package practice;

import java.util.Stack;

public class Node {
	
	Node right;
	Node left;
	String data;
	
	Node(String data){
		this.data = data;
		right = null;
		left = null;
	}
	
	
	//evaluation of tree.
	public static int multiply(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.left==null && root.right == null) {
			return Integer.parseInt(root.data);
		}	
		int right_value = multiply(root.right);
		int left_value = multiply(root.left);
		
		if(root.data=="+") {
			return right_value + left_value;
		}
		if(root.data=="*") {
			return right_value * left_value;
		}
		if(root.data=="/") {
			return right_value / left_value;
		}
		else {
			return right_value - left_value;
		}
	}
	
	
	public static Stack construct(Stack<String> s, Node root) {
		
		if(root!=null) {
			construct(s,root.right);
			s.push(root.data);
			//System.out.println(s);
			construct(s,root.left);
		}
		return s;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node("+");
		root.left = new Node("*");
		root.right = new Node("-");
		root.left.left = new Node("5");
		root.left.right = new Node("4");
		root.right.left = new Node("100");
		root.right.right = new Node("20");
		//System.out.println(multiply(root));
		
		Stack<String> s = new Stack<String>();
		System.out.println(construct(s,root));
	}

}
