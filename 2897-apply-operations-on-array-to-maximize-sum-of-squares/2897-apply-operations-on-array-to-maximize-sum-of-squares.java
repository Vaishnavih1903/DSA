class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bits = new int[31];
        long ans = 0, mod = 1_000_000_007;

        for (int n : nums)
            for (int b = 0; b < 31; b++)
                if ((n & (1 << b)) != 0) bits[b]++;

        while (k-- > 0) {
            long num = 0;
            for (int b = 0; b < 31; b++)
                if (bits[b] > 0) {
                    num |= 1L << b;
                    bits[b]--;
                }
            ans = (ans + num * num) % mod;
        }

        return (int) ans;
    }
}