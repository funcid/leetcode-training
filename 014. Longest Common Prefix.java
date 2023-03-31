class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder builder = new StringBuilder();

        String maxString = "";

        for (String candidate : strs) 
            if (candidate.length() > maxString.length())
                maxString = candidate;

        up:
        for (int i = 0; i < maxString.length(); i++) {
            
            char ch = maxString.charAt(i);

            for (String s : strs) {
                if (i >= s.length()) continue up;
                if (s.charAt(i) != ch) break up;
            }

            builder.append(ch);
        }

        return builder.toString();
    }
}