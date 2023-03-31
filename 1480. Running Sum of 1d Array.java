class Solution {
    public int[] runningSum(int[] nums) {
        
        int reduce = 0;
        int[] map = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            map[i] = reduce + nums[i];
            reduce += nums[i];
        }

        return map;
    }
}