
class Solution {
    public int numIslands(char[][] grid) {
        int counter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    counter++;
                    swim(grid, i, j);
                }
            }
        }

        return counter;
    }

    public void swim(char[][] grid, int x, int y) {

        if (x < 0) return;
        if (y < 0) return;
        if (x >= grid.length) return;
        if (y >= grid[0].length) return;

        char ch = grid[x][y];

        if (ch == '0') return;

        grid[x][y] = '0';

        swim(grid, x + 1, y);
        swim(grid, x - 1, y);
        swim(grid, x, y + 1);
        swim(grid, x, y - 1);
    }
}