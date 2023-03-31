class Solution {

    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>(s.length());
        int max = 0, start = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            
            if (map.containsKey(ch)) {
                
                int index = map.get(ch);
                start = Math.max(start, index + 1);
            }
            map.put(ch, i);

            max = Math.max(max, i - start + 1);
        } 

        return max;
    }
}