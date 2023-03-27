class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                int length = length(grid, i, j);

                if (max < length) {
                    max = length;
                }
            }
        }

        return max;
    }

    public int length(int[][] grid, int x, int y) {

        if (x < 0) return 0;
        if (y < 0) return 0;
        if (x > grid.length - 1) return 0;
        if (y > grid[0].length - 1) return 0;

        int val = grid[x][y];

        grid[x][y] = 0;

        if (val == 1) {
            return 1 +
                length(grid, x + 1, y) +
                length(grid, x - 1, y) +
                length(grid, x, y + 1) +
                length(grid, x, y - 1);
        } 
        return 0;
    }
}