package practice;

public class stackImplementation {
	
	static int array[] = new int[Integer.MAX_VALUE];
	static int index =0;
	
	public static void push(int number) {
		array[index] = number;
		index++;
		System.out.println(number+" pushed.");
	}
	
	public static void pop() {
		if(index==0) {
			System.out.println("Stack is empty.");
		}
		else {
			System.out.println(array[index-1]+" popped out");
			index--;
		}
		
	}
	
	public static void print() {
		for(int i=index-1 ;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		push(7);
		push(8);
		push(1);
		push(3);		
		push(5);		
		pop();
		print();
	}

}
