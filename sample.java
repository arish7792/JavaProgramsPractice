package practice;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[][] = {{"x","[1,2,3]"}, {"y","[1,2]"},{"v"}};
		for(int i=0 ; i<a.length; i++) {
			System.out.print(a[i][0]+" ");	
		}
		
		System.out.println();
		
		
		
		
		for(int i=0 ; i<a.length; i++) {
			
			if(a[i].length==2) {
				System.out.print(a[i][1]+ " ");	
			}
			
		}
	}

}
