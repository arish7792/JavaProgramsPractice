package practice;

import java.util.HashSet;

public class twoSumProblem {

	public static void main(String[] args) {
		
		int a[] = {1,4,3,2,5,1,7,5,3,5,0};
		int target = 6;
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			if(!hashset.contains(target - a[i])) {
				hashset.add(a[i]);
			}
			else {
				System.out.println(a[i]+","+ (target-a[i]));
			}
		}
		
	}

}
