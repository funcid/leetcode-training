class Solution {
    public int myAtoi(String s) {
        
        double num = 0;
        int sign = 0;
        boolean has = false;

        for (char ch : s.toCharArray()) {
            
            if (has && ch == ' ') break;
            if (sign != 0 && ch == ' ') break;
            if (sign != 0 && (ch == '+' || ch == '-')) break;
            if (has && (ch == '+' || ch == '-')) break;
            if (java.lang.Character.isLetter(ch) || ch == '.') break;

            if (ch == '+') sign = 1;
            if (ch == '-') sign = -1;

            if (java.lang.Character.isDigit(ch)) {
                if (num != 0) num *= 10;
                if (sign >= 0) num += ch - '0';
                if (sign < 0) num -= ch - '0';
                has = true;
            } 
        }

        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE; 
        return (int) num;
    }
}