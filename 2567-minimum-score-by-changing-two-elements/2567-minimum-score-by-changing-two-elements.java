class Solution {
    public int minimizeSum(int[] nums) {
        int n=nums.length;
        if(n<4){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        Arrays.sort(nums);
        ans=Math.min(ans,nums[n-1]-nums[2]);
        ans=Math.min(ans,nums[n-2]-nums[1]);
        ans=Math.min(ans,nums[n-3]-nums[0]);
        return ans;
    }
}