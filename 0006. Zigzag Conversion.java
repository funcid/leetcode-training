class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1) return s;

        Map<Integer, StringBuilder> map = new HashMap<>();
        boolean up = true;

        for (int i = 0; i < s.length(); i++) {

            int mod = i % (numRows - 1);

            if (mod == 0) up = !up;

            int position = up ? numRows - mod - 1 : mod;

            char ch = s.charAt(i);
            StringBuilder builder = map.getOrDefault(position, new StringBuilder());
            builder.append(ch);
            map.put(position, builder);
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < map.size(); i++) {

            builder.append(map.getOrDefault(i, new StringBuilder()));
        }

        return builder.toString();
    }
}