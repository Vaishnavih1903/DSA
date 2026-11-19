class Solution {
    public int solve(int n,int[]nums,int s1,int[][]dp){
        if(n==0){
            if(s1==0){
                return 1;
            }else{
                return 0;
            }
        }
        if(dp[n][s1]!=-1){
            return dp[n][s1];
        }

        int skip=solve(n-1,nums,s1,dp);
        int take=0;
        if(nums[n-1]<=s1){
            take=solve(n-1,nums,s1-nums[n-1],dp);
        }
        return dp[n][s1]= skip+take;
    
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        target=Math.abs(target);
        if (target > sum) return 0;
        if((sum+target)%2!=0){
            return 0;
        }
        int s1=(target+sum)/2;
        int[][]dp=new int[nums.length+1][s1+1];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return solve(nums.length,nums,s1,dp);

    }
}