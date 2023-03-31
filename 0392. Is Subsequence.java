class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int n = 0, i = 0;

        while (n < s.length() && i < t.length()) {
            if (s.charAt(n) == t.charAt(i)) {
                n++;
            }
            i++;
        }

        return n == s.length();
    }
}