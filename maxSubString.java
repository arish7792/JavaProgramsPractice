package practice;

public class maxSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,4,2,-1,-8,6,14};
		
		int curr_max = a[0];
		int running_max = a[0];
		
		
		for(int i=1; i<a.length; i++) {
			if(running_max>0) {
				running_max = running_max+a[i];
			}
			else {
				running_max = a[i];
			}
		}
		
		if(running_max>curr_max) {
			curr_max = running_max;
		}
		
		System.out.println(curr_max);
	}

}
