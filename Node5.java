package practiceTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node5 {
	
	int start;
	int end;
	
	Node5(int start, int end){
		this.start = start;
		this.end = end;
	}
	
	
	public static void overlapping(ArrayList<Node5> list) {
		
	}

	public static void main(String[] args) {
		
		ArrayList<Node5> list = new ArrayList<Node5>();	
		Node5 a = new Node5(1,2);
		Node5 c = new Node5(7,10);
		Node5 b = new Node5(2,8);
		Node5 d = new Node5(12,18);
		Node5 e = new Node5(17,19);
		
		list.add(b);
		list.add(d);
		list.add(e);
		list.add(a);
		list.add(c);

	}

}
