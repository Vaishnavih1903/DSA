class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;
        int[][]dp=new int[n][n];
        for(int j=0;j<n;j++){
            dp[0][j]=grid[0][j];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int min = Integer.MAX_VALUE;
                for(int k=0;k<n;k++){
                    if(k!=j){
                       min=Math.min(dp[i-1][k],min);
                    }
                }
                dp[i][j]=grid[i][j]+min;
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=00;i<n;i++){
            ans=Math.min(ans,dp[n-1][i]);
        }
        return ans;
    }
}