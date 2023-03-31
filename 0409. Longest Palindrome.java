class Solution {
    public int longestPalindrome(String s) {
        
        int answer = 0;
        int[] count = new int[58];

        for (int i = 0; i < s.length(); i++) {
            int was = count[s.charAt(i) - 'A'];
            
            if (was == 1) {
                answer += 2;
                count[s.charAt(i) - 'A'] = 0;
            } else {
                count[s.charAt(i) - 'A']++;
            }
        }

        int center = 0;

        for (int i = 0; i < 58; i++) {
            if (center < count[i]) {
                center = count[i];
            }
        }
        
        return answer + center;
    }
}