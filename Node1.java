package practiceTest;

public class Node1 {
	Node1 next;
	int data;
	
	Node1(int data){
		this.data = data;
	}
	
	// method to find the size of the linkedList
	public static int size(Node1 a) {
		int size = 1;
		while(a.next!=null) {
			size++;
			a = a.next;
		}
		return size;
	}
	
	
	// method to find the NthToTheLastElement
	public static int NthToTheLastElement(Node1 start, int NthElement) {
		Node1 a = start;
		Node1 b = start;
		
		for(int i=1;i<NthElement; i++) {
			if(b==null) {
				return 0;
			}
			b = b.next;
		}
		
		while(b.next!=null) {
			b=b.next;
			a=a.next;
		}
		
		return a.data;
	}
	
	
	public static void main(String[] args) {
		
		

	}
}
