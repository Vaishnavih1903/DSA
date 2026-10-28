
class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];

        for (int i = 0; i < m; i++) {
            char[] row = new char[n];

            for (int j = 0; j < n; j++) {
                row[j] = '#';
            }

            // First row is free
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    row[j] = '.';
                }
            }

            // Last column is free
            row[n - 1] = '.';

            grid[i] = new String(row);
        }

        return grid;
    }
}
