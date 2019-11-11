package practiceTest;

public class islandProblem {
	
	public static int island(int a[][]) {
		if(a==null || a.length==0) {
			return 0;
		}
		
		// starting islands are zero.
		int islands = 0;
		
		//traverse the array
		for(int i=0; i<a.length; i++) {
			for(int j=0 ;j<a[i].length; j++) {
				if(a[i][j]==1) {
					islands = islands + dfs(a,i,j);
					
				}
			}
		}	
		return islands;
	}
	
	public static int dfs(int a[][], int i, int j) {
		if(i<0 || i>=a.length || j<0 || j>=a[i].length || a[i][j]==0) {
			return 0;
		}
			a[i][j]=0;
			dfs(a,i+1,j);
			dfs(a,i-1,j);
			dfs(a,i,j+1);
			dfs(a,i,j-1);
			return 1;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
		System.out.println(island(a));
	}

}
