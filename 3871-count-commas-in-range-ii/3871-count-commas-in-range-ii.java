class Solution {
    public long countCommas(long n) {
       long ans=0;
       long comma=1;
       long start=1000;

       while(start<=n){
        long end=Math.min(n,start*1000-1);
        ans=ans+(end-start+1)*comma;
        start=start*1000;
        comma++;
       }
       return ans;

    }
}