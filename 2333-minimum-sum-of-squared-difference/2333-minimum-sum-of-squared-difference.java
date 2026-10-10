class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[]frq=new int[100001];
        long sum=0;
        long k=(long) k1+k2;
        int maxdiff=0;
        for(int i=0;i<nums1.length;i++){
            int diff=Math.abs(nums1[i]-nums2[i]);
            frq[diff]++;
            sum=sum+diff;
            maxdiff=Math.max(diff,maxdiff);

        }
        if(sum<=k){
            return 0;
        }
        for(int d=maxdiff;d>0 && k>0;d--){
            int use=(int) Math.min(k,(long) frq[d]);
            frq[d]=frq[d]-use;
            frq[d-1]+=use;
            k=k-use;


        }
        long ans=0;
        for(int d=1;d<=maxdiff;d++){
            ans+=(long)d*d*frq[d];

        }
        return ans;
    }
}