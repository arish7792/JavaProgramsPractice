package practice;

public class mostOccuringElement {
	
	mostOccuringElement next;
	int data;
	
	mostOccuringElement(int data){
		this.data = data;
		this.next = null;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mostOccuringElement root = new mostOccuringElement(1);
		root.next = new mostOccuringElement(2);
		root.next.next = new mostOccuringElement(3);
		root.next.next.next = new mostOccuringElement(4);
		root.next.next.next.next = new mostOccuringElement(5);
		root.next.next.next.next.next = new mostOccuringElement(6);
		
		mostOccuringElement first = root;
		mostOccuringElement second = root;
		
		while(second.next!=null && second.next.next!=null) {
			first = first.next;
			second = second.next.next;
		}
		
		mostOccuringElement prev = null;
		mostOccuringElement curr = root;
		mostOccuringElement oneroot = root;
		while(root!=first) {
			//System.out.println(root.data);
			curr = curr.next;
			root.next=prev;
			prev=root;
			root = curr;	
			
		}
		oneroot.next = first;
		//System.out.println(prev.data);
		while(prev!=null) {
			System.out.println(prev.data);
			prev = prev.next;
		}

	}

}
