class Solution {
    public String reverseWords(String s) {
        
        StringBuilder builder = new StringBuilder();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ' ') {
                if (!builder.isEmpty()) {
                    builder.append(' ');
                }
                while (!stack.isEmpty()) {
                    builder.append(stack.pop());
                }
            } else {
                stack.push(ch);
            }
        }

        if (!stack.isEmpty()) {
            if (!builder.isEmpty()) {
                builder.append(' ');
            }
            while (!stack.isEmpty()) {
                builder.append(stack.pop());
            }
        }

        return builder.toString();
    }
}