/*class Solution {
    public boolean check(int[] nums) {
        int[]nu=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nu[i]=nums[i];
        }
        Arrays.sort(nu);
        for(int i=0;i<nums.length;i++){
            int[]temp=nu.clone();
            rotate(temp,i);
            if(Arrays.equals(temp,nums)){
                return true;
            }
        }
        return false;
    }

    void rotate(int[]nums,int k){
        int n=nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);



    }
    void reverse(int[]nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }
}*/
class Solution{
    public boolean check(int[]nums){
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}