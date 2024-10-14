import java.util.Arrays;
import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int [][] dp = new int [n][2];
        for(int [] i: dp) Arrays.fill(i,-1);

        return solve (0,n,0,prices,dp);        
    }
    public int solve(int index, int n, int buy, int [] prices, int [][] dp){

        if(index ==n) return 0;

        if(dp[index][buy]!=-1) return dp[index][buy];
        int profit =0;
        if(buy ==0){// buy
            profit = Math.max( 0+solve(index+1,n,0,prices,dp),
            -prices[index]+ solve(index+1,n,1,prices,dp));
        }

        if(buy ==1){
            profit = Math.max(0+solve(index+1,n,1,prices,dp),
            prices[index]+solve(index+1,n,0,prices,dp));
        }
        return dp[index][buy] = profit;

    }
}