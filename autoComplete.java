package practiceTest;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class autoComplete {

	public static void main(String[] args) {
		int k = 4;
		
		int a[] = {0,1,0,2,4,13,2,12};
		
		//1,2,3,3,4,4,6,7,9
		
		//PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		int index =0;
		
		for(int i=0 ; i<a.length; i++) {
			if(a[i]==0) {
				int temp;
				temp = a[index];
				a[index] =a[i];
				a[i]= temp;
				index++;
			}
			
		}
		
		for(int i=0 ;i<a.length; i++) {
			System.out.println(a[i]);
		}

}
}
