package practiceTest;

public class Node4 {
	
	Node4 next;
	int data;
	
	Node4(int data){
		this.data = data;
		this.next = null;
	}
	
	public static void reverseFromMiddle(Node4 root) {
		Node4 one = root;
		Node4 two = root;
		
		while(two.next!=null && two.next.next!=null) {
			one = one.next;
			two = two.next.next;
		}
		
		Node4 middle = one.next;
		one.next = null;
		
		Node4 prev = null;
		Node4 next = null;
		Node4 start1 = root;
		
		while(root!=null) {
			next = root.next;
			root.next = prev;
			prev = root;
			root = next;
		}
		prev.next = middle;
		
		while(start1!=null) {
			System.out.println(start1.data);
			start1 = start1.next;
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node4 root = new Node4(1);
		root.next = new Node4(2);
		root.next.next = new Node4(3);
		root.next.next.next = new Node4(4);
		root.next.next.next.next = new Node4(5);
		
		reverseFromMiddle(root);

	}

}
