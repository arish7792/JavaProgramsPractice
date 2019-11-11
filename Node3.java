package practiceTest;

public class Node3 {
	
	Node3 next;
	int data;
	
	Node3(int data){
		this.data = data;
		this.next = null;
	}
	
	public static void reverse(Node3 root) {
		Node3 prev = null;
		Node3 next = null;
		
		while(root!=null) {
			next = root.next;
			root.next = prev;
			prev = root;
			root =next;
		}
		
		while(root!=null) {
			System.out.println(root.data);
			root=root.next;
		}
	}
	
	public static void middleElement(Node3 root) {
		
		Node3 first = root;
		Node3 second = root;
		
		while(first.next!=null && second.next!=null && second.next.next!=null){
			first = first.next;
			second = second.next.next;
		}
		
		System.out.println(first.data);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node3 root = new Node3(1);
		root.next = new Node3(2);
		root.next.next = new Node3(3);
		root.next.next.next = new Node3(4);
		root.next.next.next.next = new Node3(5);
		

		middleElement(root);
		
	}

}
