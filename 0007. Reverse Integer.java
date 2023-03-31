class Solution {
    public int reverse(int x) {
        
        long fresh = x < 0 ? -0 : 0;

        while (x != 0) {
            fresh *= 10;
            fresh += x % 10;
            x /= 10;
        }

        int total = (int) fresh;

        if (total != fresh) return 0;

        return total;
    }
}