class Solution {
    public int maxArea(int[] height) {
        
        int max = -1;
        int l = 0, r = height.length - 1;

        while (l != r) {

            int a = height[l], b = height[r];
            int S = Math.min(a, b) * Math.abs(l - r);

            if (S > max) {
                max = S;
            }
            if (b >= a) {
                l++;
            }
            if (b < a) {
                r--;
            }
        }

        return max;
    }
}