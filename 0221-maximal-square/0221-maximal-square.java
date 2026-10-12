class Solution {
    public int maximalSquare(char[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][]dp=new int[rows][cols];
        int maxval=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]=='1'){
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }
                    else{
                        dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                    }
                    maxval=Math.max(maxval,dp[i][j]);
                }
                

            }
        }
        return maxval*maxval;

    }
}