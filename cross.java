package practice;

public class cross {

	public static void main(String[] args) {
		int i =20;
		int j =0;
		while(i!=0 && j!=20) {
			for(int x=0; x<=20;x++) {
				if(x==i || x==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			i--;
			j++;
		}
	}
}
