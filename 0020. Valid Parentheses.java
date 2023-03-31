class Solution {
    public boolean isValid(String s) {

        ArrayDeque<Character> x = new ArrayDeque<>();

        Map<Character, Character> mapping = new HashMap<>();

        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char ch : s.toCharArray()) {

            boolean start = ch == '(' || ch == '[' || ch == '{';

            if (!start && x.isEmpty()) return false;

            if (start) {
                x.push(ch);
            } else if (x.peek() == mapping.get(ch)) {
                x.pop();
            } else {
                return false;
            }
        }

        return x.isEmpty();
    }
}