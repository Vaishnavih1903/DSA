class Solution {
    public int minOperations(int[] nums, int x) {
        int totalsum=0;
        int n=nums.length;
        for(int num:nums){
            totalsum=totalsum+num;
        }
        int target=totalsum-x;
        if(target<0){
            return -1;
        }
        if(target==0){
            return n;
        }

        int left=0;
        int sum=0;
        int minlen=-1;
        for(int right=0;right<n;right++){
           sum=sum+nums[right];
           while(sum>target){
            sum=sum-nums[left];
            left++;
           }

           if(sum==target){
            minlen=Math.max(minlen,right-left+1);

           }
        }

        if(minlen==-1){
            return -1;
        }
        return n-minlen;
    }
}