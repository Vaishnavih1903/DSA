class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        List<Integer>pos=new ArrayList<>();
        List<Integer>neg=new ArrayList<>();
        for(int num:nums){
            if(num<0){
                neg.add(num);
            }else{
                pos.add(num);
            }
        }
        int idx=0;
        for(int i=0;i<pos.size();i++){
            nums[idx++]=pos.get(i);
            nums[idx++]=neg.get(i);
        }
        return nums;
    }
}