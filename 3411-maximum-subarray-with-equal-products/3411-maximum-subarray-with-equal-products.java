class Solution {
    int gcd(int a,int b){
        while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
        }
        return a;
    }
    int lcm(int a,int b){
        return (a/gcd(a,b)) * b;

    }
    public int maxLength(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            long prod=1;
            int l=1;
            int g=0;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                g=gcd(g,nums[j]);
                l=lcm(l,nums[j]);

                if(prod==(long)(g*l)){
                   ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}