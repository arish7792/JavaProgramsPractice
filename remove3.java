package practice;

public class remove3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "aaaabbbccdddddd";
		
		int count = 1;
		
		for (int i=0; i<a.length()-1; i++) {
			if (a.charAt(i) == a.charAt(i+1)) {
				if (count<3) {
					count++;
				}
				else if(count ==3) {
					System.out.print(a.charAt(i));
					count =1;
				}
			}
			else if(a.charAt(i) != a.charAt(i+1)) {
				if(count==3) {
					System.out.print(a.charAt(i));
					count=1;
				}
				else if(count<3) {
					for(int j=0 ;j<count;j++) {
						System.out.print(a.charAt(i));						
					}
					count=1;
				}
			}	
		}
		
		if(count==3) {
			System.out.println(a.charAt(a.length()-1));
		}
		else {
		for(int i=0;i<count; i++) {
			System.out.print(a.charAt(a.length()-1));
		}
		}
	}

}
