class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        boolean[][]dp=new boolean[nums.length+1][target+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                boolean skip=dp[i-1][j];
                boolean take=false;
                if(nums[i-1]<=j){
                    take=dp[i-1][j-nums[i-1]];

                }

                dp[i][j]=skip||take;
            }
        }
        return dp[n][target];
    }    
}