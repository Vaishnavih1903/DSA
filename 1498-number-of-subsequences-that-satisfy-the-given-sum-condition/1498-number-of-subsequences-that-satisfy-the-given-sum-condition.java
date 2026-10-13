
import java.util.*;

class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);

        int MOD = 1_000_000_007;
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int ans = 0;

        int[] power = new int[n];
        power[0] = 1;

        for (int i = 1; i < n; i++) {
            power[i] = (int)((2L * power[i - 1]) % MOD);
        }

        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                ans = (int)((ans + (long)power[right - left]) % MOD);
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
}
