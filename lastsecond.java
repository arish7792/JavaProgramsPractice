package practice;

public class lastsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "ORRANGE";
		StringBuilder answer = new StringBuilder();
		int x=0;
		
		for(int i=a.length()-1 ;i>0; i--) {
			if(x!=2) {
			answer = answer.append(a.charAt(i));
			x++;
			} 
			else {
				break;
			}
		}
		String g = answer.charAt(0)+" "+answer.charAt(1);
		System.out.println(g);
		

	}

}
