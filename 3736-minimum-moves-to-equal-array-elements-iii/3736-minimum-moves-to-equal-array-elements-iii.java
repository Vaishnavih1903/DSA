class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int num:nums){
            max=Math.max(num,max);

        }
        int ans=0;

        for(int i=0;i<nums.length;i++){
          ans+=(max-nums[i]);
        }
        return ans;
    }
}