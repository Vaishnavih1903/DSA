class Solution {
    public int numOfSubarrays(int[] arr) {
        int ans=0;
        int odd=0;
        int even=1;
        int prefix=0;
        int mod = 1000000007;
        for(int num:arr){
           prefix+=num;
           if(prefix%2==0){
            even++;
            ans+=odd;
           }
           else{
            odd++;
            ans+=even;
           }
           ans%=mod;
        }
        return ans;
    }
}