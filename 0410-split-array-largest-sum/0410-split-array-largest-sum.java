class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int num:nums){
            low=Math.max(num,low);
            high=high+num;
        }

        while(low<=high){
            int mid=(low+high)/2;
            if(cansplit(nums,k,mid)){
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return low;
    }

        boolean cansplit(int[]nums,int k,int maxsum){
            int sum=0;
            int count=1;
            for(int num:nums){
                if(sum+num<=maxsum){
                    sum+=num;

                }else{
                    count++;
                    sum=num;
                }
            }
            return count<=k;
        }
    
}