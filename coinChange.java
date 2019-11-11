package practiceTest;

import java.util.Arrays;

public class coinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[] = {1,2,5};
		int amount = 11;
		
		// filling all coins by random value
		int dp[] = new int[amount+1];		
		Arrays.fill(dp, amount+1);
		
		dp[0]=0;
		
		for(int i=0; i<dp.length;i++) {
			for(int j=0; j<coins.length;j++) {
				if(i>=coins[j]) {
					dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
				}
			}
		}
		
		if(dp[amount]<amount+1) {
			System.out.println(dp[amount]);
		}
		else {
			System.out.println(-1);
		}
	}

}
