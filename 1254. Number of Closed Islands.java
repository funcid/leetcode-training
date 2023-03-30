class Solution {
    public int closedIsland(int[][] grid) {
        
        int islands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 0 && fill(grid, i, j)) {
                    islands++;
                }
            }
        }

        return islands;
    }

    public boolean fill(int[][] grid, int x, int y) {

        if (x < 0) return false;
        if (y < 0) return false;
        if (x > grid.length - 1) return false;
        if (y > grid[0].length - 1) return false;

        int val = grid[x][y];

        grid[x][y] = 1;

        if (val == 0) {

            boolean r = fill(grid, x + 1, y);
            boolean l = fill(grid, x - 1, y);
            boolean u = fill(grid, x, y + 1);
            boolean d = fill(grid, x, y - 1);

            return r && l && u && d;
        }

        return true;
    }
}