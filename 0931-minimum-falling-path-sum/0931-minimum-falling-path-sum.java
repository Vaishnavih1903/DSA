class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[][]dp=new int[n][n];
        for(int j=0;j<n;j++){
            dp[0][j]=matrix[0][j];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int up=dp[i-1][j];

                int leftup=Integer.MAX_VALUE;
                if(j>0){
                    leftup=dp[i-1][j-1];
                }

                int rightup=Integer.MAX_VALUE;
                if(j<n-1){
                    rightup=dp[i-1][j+1];
                }

                dp[i][j]=matrix[i][j]+Math.min(up,Math.min(leftup,rightup));


            }
        }

        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(ans,dp[n-1][i]);
        }
        return ans;
    }
}