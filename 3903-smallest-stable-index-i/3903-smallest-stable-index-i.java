class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int l = 0;
        int n = nums.length;
        int diff = Integer.MAX_VALUE;

        while (l < n) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i <= l; i++) {
                max = Math.max(max, nums[i]);
            }

            for (int i = l; i < n; i++) {
                min = Math.min(min, nums[i]);
            }

           if(max-min<=k){
            return l;
           }
            l++;
        }

        return -1;
    }
}