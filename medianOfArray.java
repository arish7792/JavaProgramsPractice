package practiceTest;

public class medianOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,8,6,7};
		int start = 0;
		int end = a.length-1;
		
		while(start+1<end-1) {
			start++;
			end--;
		}
		System.out.println(a[start]);
		System.out.println(a[end]);
	}

}
