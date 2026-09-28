class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int low=1;
        int high=0;
        for(int num:nums){
            high=Math.max(high,num);
        }
        while(low<=high){
            int mid=(low+high)/2;
            long sum=0;
            for(int num:nums){
                sum+=(num+mid-1)/mid;
                

            }
            if(sum<=h){
                high=mid-1;

            }else{
                low=mid+1;
            }

        }
        return low;

    
    }
}