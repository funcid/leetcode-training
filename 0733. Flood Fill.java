class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int target = image[sr][sc];
        
        fill(image, target, sr, sc, color);
        return image;
    }

    public void fill(int[][] image, int t, int sr, int sc, int color) {

        if (sr >= 0 && sc >= 0 && sr < image.length && sc < image[0].length && image[sr][sc] == t && image[sr][sc] != color) {
            image[sr][sc] = color;
            fill(image, t, sr - 1, sc, color);
            fill(image, t, sr + 1, sc, color);
            fill(image, t, sr, sc + 1, color);
            fill(image, t, sr, sc - 1, color);
        }
    }
}