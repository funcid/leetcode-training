class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) {
                    return false;
                }
            } else if (set1.contains(ch1) || set2.contains(ch2)) {
                return false;
            } else {
                map.put(ch1, ch2);
                set1.add(ch1);
                set2.add(ch2);
            }
        }

        return true;
    }
}