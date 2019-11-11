package practiceTest;

public class Node2 {
	
	Node2 next;
	int data;
	int max;
	
	static Node2 start;
	
	public static void push(int value) {
		
		Node2 node = new Node2();
		node.data = value;
		
		if (start==null) {
			start = node;
		}
		else {
			node.next = start;
			start = node;
		}
	}
	
	public static void pop() {
		start = start.next;
	}
	
	public static void print() {
		while(start.next!=null) {
			System.out.print(start.data+" ");
			start = start.next;
		}
	}
	
	public static void main(String[] args) {
		push(8);
		push(9);
		push(10);
		print();
	}

}
