class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long[]sqr=new long[n];
        for(int i=0;i<nums.length;i++){
            sqr[i]=(long)(nums[i]*nums[i]);
        }
        Arrays.sort(sqr);
        long ans=0;
        for(int i=0;i<n/2;i++){
            ans=ans-sqr[i];
        }
        for(int i=n/2;i<n;i++){
            ans=ans+sqr[i];
        }
        return ans;
    }
}