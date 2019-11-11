package practiceTest;

public class tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Arish! is a boy, hai";
		
		String b[] = a.split("[!, ]");
		
		for(int i=0 ;i<b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
