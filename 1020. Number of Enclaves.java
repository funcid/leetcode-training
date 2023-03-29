class Solution {
    public int numEnclaves(int[][] grid) {
        
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1) {
                    int drop = drop(grid, i, j);
                    count += drop > 0 ? drop : 0;
                }
            }
        }

        return count;
    }

    public int drop(int[][] grid, int x, int y) {

        if (x < 0) return -1;
        if (y < 0) return -1;
        if (x >= grid.length) return -1;
        if (y >= grid[0].length) return -1;

        int val = grid[x][y];

        grid[x][y] = 0;

        if (val == 1) {
            int l = drop(grid, x - 1, y);
            int r = drop(grid, x + 1, y);
            int u = drop(grid, x, y + 1);
            int d = drop(grid, x, y - 1);

            boolean border = l < 0 || r < 0 || u < 0 || d < 0;

            if (border) {
                return -1;
            }
            return 1 + l + r + u + d;
        }

        return 0;
    }
}