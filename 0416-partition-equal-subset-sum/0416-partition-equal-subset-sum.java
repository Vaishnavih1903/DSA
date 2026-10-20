class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        Boolean[][]dp=new Boolean[nums.length][target+1];
        return solve(nums,0,target,dp);
    }
    boolean solve(int[]nums,int idx,int t,Boolean[][]dp){
         if(t==0){
            return true;
        }
        if(idx==nums.length){
            return false;
        }
       
        if (dp[idx][t]!= null) {
            return dp[idx][t];
        }
        boolean ntake=solve(nums,idx+1,t,dp);
        boolean take=false;
        if(nums[idx]<=t){
            take=solve(nums,idx+1,t-nums[idx],dp);
        }
        dp[idx][t]=take || ntake;
        return dp[idx][t];
    }
}