class Solution {
    public int maxProfit(int[] prices){
    int n= prices.length;
    int [][][] dp= new int[n+1][2][3];
    
    for(int i=0; i<n; i++)
    {
        for(int buy=0; buy<=1; buy++){
            dp[i][buy][0]= 0;
        }
    }
     for(int buy=0; buy<=1; buy++)
     {
        for(int maxTransaction=0; maxTransaction<=2; maxTransaction++){
            dp[n][buy][maxTransaction]= 0;
        }
    }
        
    for(int i= n-1; i>=0; i--){
        int profit=0;
        for(int buy=0; buy<=1; buy++){
            for(int maxTransaction=1; maxTransaction<=2; maxTransaction++){
               if(buy==1)
               {
        int take= -prices[i] + dp[i+1][0][maxTransaction];
        int notTake= 0 + dp[i+1][1][maxTransaction];
        profit= Math.max(take, notTake);
        dp[i][buy][maxTransaction]= profit;
                   
            }else if(buy==0)
            {
                   
        int take= prices[i] + dp[i+1][1][maxTransaction-1];
        int notTake= 0 + dp[i+1][0][maxTransaction];
        profit= Math.max(take, notTake);   
        dp[i][buy][maxTransaction]= profit;
    }
 }
}  
}
      return dp[0][1][2];
}
}
