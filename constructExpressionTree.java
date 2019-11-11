package practiceTest;

import java.util.Stack;

public class constructExpressionTree {
	
	char data;
	constructExpressionTree left;
	constructExpressionTree right;
	
	constructExpressionTree(char c){
		this.data = c;
		left = null;
		right = null;
	}
	
	public static constructExpressionTree constructTree(char a[]) {
	
		Stack<constructExpressionTree> stack = new Stack<constructExpressionTree>();
		//Node t,t1,t2;
		
		// if operand remove top 2 from stack and make them children of operator
		for(int i=0 ;i<a.length ; i++) {
			if(a[i]=='*' || a[i]=='+' || a[i]=='-') {
				constructExpressionTree t = new constructExpressionTree(a[i]);
				constructExpressionTree t1 = stack.pop();
				constructExpressionTree t2 = stack.pop();
				t.right = t1;
				t.left = t2;
				stack.push(t);	
			}
			
			// else just push them by making the node.
			else {
				constructExpressionTree t = new constructExpressionTree(a[i]);
				stack.push(t);
			}
		}
		
		constructExpressionTree x = stack.pop();
		return x;
	}
	
	public static void inorder(constructExpressionTree a) {
		if(a!=null) {
		inorder(a.left);
		System.out.println(a.data +" ");
		inorder(a.right);
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[] = {'a','b','+','e','f','*','g','*','-'};
		constructExpressionTree x = constructTree(a);
		inorder(x);
	}

}
