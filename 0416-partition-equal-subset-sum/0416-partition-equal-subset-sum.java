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
        boolean[]prev=new boolean[target+1];
        boolean[]curr=new boolean[target+1];
        prev[0]=true;
        curr[0]=true;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                boolean skip=prev[j];
                boolean take=false;
                if(nums[i-1]<=j){
                    take=prev[j-nums[i-1]];

                }

                curr[j]=skip||take;
            }
            prev=curr.clone();
        }
        return prev[target];
    }    
}