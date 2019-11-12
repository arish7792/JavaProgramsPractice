package practice;

public class Node3 {
	
	Node3 next;
	int data;
	
	Node3(int data){
		this.data = data;
		this.next = null;
	}
	
	 static Node3 root = null;
	 static Node3 root1;
	
	public static void push(int a) {
//		if(root==null) {
//			root.data = a;
//		}
//		else {
			Node3 x = new Node3(a);
			x.next = root;
			root = x;
			root1=root;
		}
//	}
	
	public static void pop() {
		
		if(root1!=null) {
			System.out.println(root1.data);
			//Node temp = null;
			root1 = root1.next;
			
		}
//		else {
//			sys
//		}
		
	}
	
	public static void print() {
		while(root!=null) {
			System.out.print(root.data+" ");
			root = root.next;
		}
	}

	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		push(4);
		
		print();
		System.out.println();
		pop();
		System.out.println();
		pop();
		System.out.println();
		pop();
		System.out.println();
		pop();
	}

}
