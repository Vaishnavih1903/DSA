
class Solution {
    public int paintWalls(int[] cost, int[] time) {

        int n = cost.length;

        int[][] t = new int[n + 1][n + 1];

        // t[i][j] = minimum cost to cover at least j walls
        // using first i walls

        // Initialize all states as infinity
        for (int i = 0; i <= n; i++) {
            Arrays.fill(t[i], 1000000000);
        }

        // Base case: 0 walls require 0 cost
        for (int i = 0; i <= n; i++) {
            t[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                // Skip current wall
                int skip = t[i - 1][j];

                // Pick current wall
                int take = cost[i - 1] +
                    t[i - 1][Math.max(0, j - time[i - 1] - 1)];

                t[i][j] = Math.min(take, skip);
            }
        }

        return t[n][n];
    }
}
