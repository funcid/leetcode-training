class Solution {
    public List<Integer> grayCode(int n) {
        
        return IntStream.of(0, 1 << n)
            .map(i -> i ^ ( i >> 1))
            .collect(Collectors.toList());
    }
}