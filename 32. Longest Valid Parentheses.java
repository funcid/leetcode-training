class Solution {
    public int longestValidParentheses(String s) {
        
        int longest = 0;

        for (int i = 0; i < s.length(); i++) {

            int stack = 0;
            int j = 0;

            while (stack >= 0 && i + j < s.length()) {

                char ch = s.charAt(i + j);
                j++;

                if (ch == '(') {
                    stack++;
                } else if (ch == ')') {
                    stack--;
                }
                if (stack == 0) {
                    longest = Math.max(longest, j);
                }
                if (stack < 0) {
                    continue;
                }
            }
        }

        return longest;
    }
}