class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> answer = new ArrayList<>();

        gen(answer, n, 1, 0, "(");

        return answer;
    }

    public void gen(List<String> storage, int n, int open, int close, String str) {
        if (str.length() == n * 2) {
            storage.add(str);
            return;
        } 
        if (open < n) gen(storage, n, open + 1, close, str + '(');
        if (open > close) gen(storage, n, open, close + 1, str + ')');
    }
}