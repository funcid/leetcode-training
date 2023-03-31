class Solution {
    public String longestPalindrome(String s) {
        
        String word = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            
            int l = i, r = i;

            char current = s.charAt(i);

            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {

                if (r - l + 1 > max) {
                    word = s.substring(l, r + 1);
                    max = r - l + 1;
                }
                l--;
                r++;
            }

            l = i; r = i + 1;

            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {

                 if (r - l + 1 > max) {
                    word = s.substring(l, r + 1);
                    max = r - l + 1;
                }
                l--;
                r++;
            }
        }

        return word;
    }
}