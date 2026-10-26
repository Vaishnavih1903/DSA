class Solution {
    long sum = 0;
    public int countIslands(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0){
                     sum=0;
                    dfs(grid,i,j);
                    if(sum%k==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    private void dfs(int[][]grid,int i,int j){
        int n=grid.length;
        int m=grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0){
            return ;

        }
        sum+=grid[i][j];
        grid[i][j]=0;
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
    }
}