package practice;

public class bubbleSort {
	
	public static void bubble(int a[]) {
		
		for(int i=0 ;i<a.length-1; i++) {
			for(int j=0 ;j<a.length-i-1; j++) {
				if (a[j]> a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int i=0 ;i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,2,3,1,6,1,8,9,10,1};
		bubble(a);
	}

}
