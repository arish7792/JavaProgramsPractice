package practiceTest;

public class stringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int nums[] = {1,1,2};
		    int i = 0;
		    for (int j = 1; j < nums.length; j++) {
		        if (nums[j] != nums[i]) {
		            i++;
		            nums[i] = nums[j];
		        }
		    }
		    System.out.println(i+1);
		

	}

}
