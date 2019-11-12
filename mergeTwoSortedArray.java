package practice;

public class mergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,8,9,16};
		int b[] = {1,8,9,10,11,12};
		
		int x =0;
		int y =0;
		
		while(x<a.length && y<b.length) {
			if(a[x]<b[y]) {
				System.out.println(a[x]);
				x++;
			}
			else if(a[x]>b[y]) {
				System.out.println(b[y]);
				y++;
			}
			else {
				System.out.println(a[x]);
				System.out.println(b[y]);
				x++;
				y++;
			}
		}
		
		if(x!=a.length-1) {
			for(int i = x; i<a.length; i++) {
				System.out.println(a[x]);
			}
		}
		if(y!=b.length-1) {
			for(int i=y ; i<b.length; i++) {
				System.out.println(b[y]);
			}
		}
		
	}

}
