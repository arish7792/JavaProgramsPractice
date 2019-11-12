package practice;

public class Node5 {
	int data;
	Node5 left;
	Node5 right;
	
	Node5(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	// searching the element.
	public static void search(Node5 root, int key) {
		if(root==null) {
			System.out.println("Not found");
		}
		else if(root.data == key) {
			System.out.println("found");
		}
		else if(key>root.data) {
			search(root.right,key);
		}
		else {
			search(root.left,key);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node5 root = new Node5(8);
		root.left = new Node5(3);
		root.left.left = new Node5(1);
		root.right = new Node5(10);
		root.left.left = new Node5(1);
		root.left.right = new Node5(6);
		root.right.right = new Node5(14);
		
		//search(root,11);

	}

}
