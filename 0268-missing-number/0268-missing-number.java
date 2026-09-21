class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int currentsum=0;
        int actualsum=(n*(n+1))/2;
        for(int nm:nums){
            currentsum+=nm;

        }
        int ans=actualsum-currentsum;
        return ans;
    }
}