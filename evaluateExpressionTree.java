package practiceTest;

public class evaluateExpressionTree {
	
	evaluateExpressionTree left;
	evaluateExpressionTree right;
	char c;
	
	evaluateExpressionTree(char c){
		this.c = c;
		this.left = null;
		this.right = null;
	}
	
	public static int evaluate(evaluateExpressionTree a) {
		
		// if leaf node return the numeric value.
		if(a.right==null && a.left == null) {
			return Character.getNumericValue(a.c);
		}
		
		
		int left_val = evaluate(a.left);
		int right_value = evaluate(a.right);
		
		//when reached the operator.
		if(a.c == '*') {
			return left_val * right_value;
		}
		if(a.c == '-') {
			return left_val - right_value;
		}
		if(a.c == '+') {
			return left_val + right_value;
		}
			return left_val / right_value;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		evaluateExpressionTree a = new evaluateExpressionTree('+');
		a.left = new evaluateExpressionTree('3');
		a.right = new evaluateExpressionTree('*');
		a.right.right = new evaluateExpressionTree('2');
		a.right.left = new evaluateExpressionTree('+');
		a.right.left.left = new evaluateExpressionTree('5');
		a.right.left.right = new evaluateExpressionTree('9');
		System.out.println(evaluate(a));
	}

}
