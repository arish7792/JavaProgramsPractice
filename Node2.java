package practice;

public class Node2 {
		Node2 next;
		int data;
		
		Node2(int data){
			this.data = data;
			this.next = null;
		}
		
		public static void reverse(Node2 root) {
			Node2 prev = null;
			Node2 next = null;
			//Node current;
			
			while(root!=null) {
				next = root.next;
				root.next = prev;
				prev=root;
				root=next;
			}
			
			while(prev!=null) {
				System.out.println(prev.data);
				prev = prev.next;
			}
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node2 root = new Node2(1);
		root.next = new Node2(2);
		root.next.next = new Node2(3);
		root.next.next.next = new Node2(4);
		root.next.next.next.next = new Node2(5);
		
		reverse(root);
		

	}

}
