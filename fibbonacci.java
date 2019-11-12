package practice;

public class fibbonacci {
	
	public static void fib(int index) {
		int first = 1;
		int second = 1;
		int c=0;
		if(index==0) {
			System.out.println(first);
		}
		else if(index==1) {
			System.out.println(second);
		}
		else {
			for(int i=0; i<index-1;i++) {
				c = first+second;
				first=second;
				second=c;
			}
			System.out.println(c);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib(7);
	}

}
