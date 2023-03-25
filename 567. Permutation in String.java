class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if (s1.length() > s2.length()) return false;

        int[] l = new int[26];
        int[] r = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            l[s1.charAt(i) - 'a']++;
            r[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(l, r)) {
               return true;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {

            r[s2.charAt(i) - 'a']--;
            r[s2.charAt(i + s1.length()) - 'a']++;

            if (Arrays.equals(l, r)) {
                return true;
            }
        }

        return false;
    }
}