class Solution {
    public int closedIsland(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       for(int i=0;i<n;i++){
        dfs(grid,i,0);
        dfs(grid,i,m-1);
       } 
       for(int i=0;i<m;i++){
        dfs(grid,0,i);
        dfs(grid,n-1,i);
       }
       int ans=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==0){
                ans++;
                dfs(grid,i,j);
            }
        }
       }
       return ans;
    }
    private void dfs(int[][]grid,int i,int j){
        int n = grid.length;
        int m = grid[0].length;
        if( i<0 || i>=n || j<0 || j>=m || grid[i][j]==1 ){
            return;
        }

        grid[i][j]=1;
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
    }
}