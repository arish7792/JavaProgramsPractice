package practice;

import java.util.Stack;

public class binaryNumber {
	
	public void binaryNumber(int number) {
		
		Stack<String> stack = new Stack<String>();
		
		while(number/2!=0) {
			stack.push(Integer.toString(number%2));
			number = number/2;
		}
		stack.push(Integer.toString(number));
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryNumber binary = new binaryNumber();
		binary.binaryNumber(7);
		
			
		
	}

}
