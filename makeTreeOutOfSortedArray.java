package practiceTest;

public class makeTreeOutOfSortedArray {
	makeTreeOutOfSortedArray left;
	makeTreeOutOfSortedArray right;
	int data;
	
	makeTreeOutOfSortedArray(int data){
		this.right = null;
		this.left = null;
		this.data = data;
	}
	
	
	// pick up middle element, set it up as root and perform the same on left and right part.
	public static makeTreeOutOfSortedArray tree(int a[]) {
		if(a==null || a.length ==0) {
		return null;
	}
		
		// pass the starting index, end index and array.
		return recursive(a,0,a.length-1);
	}
	
	
	public static makeTreeOutOfSortedArray recursive(int a[],int start, int end) {
		
		// if left is greater than right.
		if(start>end) {
			return null;
		}
		
		// calculating the mid and making it root.
		int mid = (start+end)/2;
		makeTreeOutOfSortedArray current = new makeTreeOutOfSortedArray(mid);
		
		// setting left and right.
		current.left = recursive(a,start,mid-1);
		current.right = recursive(a,mid+1,end);
		return current;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
