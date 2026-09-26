class Solution {
    public int maxScore(int[] nums, int k) {
        int leftsum=0;
        int rightsum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            leftsum+=nums[i];

        }
        maxsum=leftsum;
        int right=nums.length-1;
        for(int i=k-1;i>=0;i--){
            leftsum=leftsum-nums[i];
            rightsum=rightsum+nums[right];
            right--;

            maxsum=Math.max(maxsum,leftsum+rightsum);
        }

       return maxsum;

    }
}