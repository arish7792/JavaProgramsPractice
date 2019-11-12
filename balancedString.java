package practice;

import java.util.Stack;

public class balancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "][";
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0 ;i<a.length(); i++) {
			if(a.charAt(i)=='[' || a.charAt(i)=='(' || a.charAt(i)=='{') {
				stack.push(a.charAt(i));
				}
			else if(a.charAt(i)==']' || a.charAt(i)==')' || a.charAt(i)=='}') {
				if(stack.isEmpty()) {
					stack.push(a.charAt(i));
				}
				else if(stack.peek()==']' || stack.peek()=='}' || stack.peek()==')') {
					stack.pop();
				}
					}
			}
		
		
		if(stack.isEmpty()) {
			System.out.println("It is the balanced string.");
		}
		else {
			System.out.println("String is not balanced.");
		}
	}

}
