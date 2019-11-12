package practice;

public class zerosAndOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {0,0,0,0,0,0,1,0,0,1};
		
		int index = 0;
		
		for(int i=0 ;i<a.length; i++) {
			if(a[i]==1) {
				int temp = a[i];
				a[i] = a[index];
				a[index]=temp;
				index++;
			}
			
		}
		
		for(int i=0 ; i<a.length; i++) {
			System.out.print(a[i]);
		}

	}

}
