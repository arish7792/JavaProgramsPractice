package practice;

public class Node1 {
	
	int data;
	Node1 next;
	
	Node1(int data){
		this.data = data;
		this.next = null;
	}
	

	public static void main(String[] args) {
		Node1 first = new Node1(1);
		first.next = new Node1(2);
		//first.next.next 

	}

}
