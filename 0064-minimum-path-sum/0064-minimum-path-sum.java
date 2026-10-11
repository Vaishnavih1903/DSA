
/*import java.util.Arrays;

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] t = new int[m][n];

        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        return solve(grid, 0, 0, m, n, t);
    }

    public int solve(int[][] grid, int i, int j,
                     int m, int n, int[][] t) {

        if (i == m - 1 && j == n - 1) {
            return grid[i][j];
        }

        if (t[i][j] != -1) {
            return t[i][j];
        }

        if (i == m - 1) {
            // Can only go RIGHT
            return t[i][j] = grid[i][j]
                    + solve(grid, i, j + 1, m, n, t);
        } else if (j == n - 1) {
            // Can only go DOWN
            return t[i][j] = grid[i][j]
                    + solve(grid, i + 1, j, m, n, t);
        } else {
            // Can go DOWN or RIGHT
            return t[i][j] = grid[i][j] + Math.min(
                    solve(grid, i + 1, j, m, n, t),
                    solve(grid, i, j + 1, m, n, t)
            );
        }
    }
}*/

class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m][n];
        dp[0][0]=grid[0][0];
        for(int j=1;j<n;j++){
            dp[0][j]=grid[0][j]+dp[0][j-1];
        }
        for(int i=1;i<m;i++){
            dp[i][0]=grid[i][0]+dp[i-1][0];

        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
  
    }
}