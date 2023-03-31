class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int current = 0;

        for (int i = 0; i < nums.length; i++) {

            if (sum - current - nums[i] == current) {
                return i;
            }
            current += nums[i];
        }

        return -1;
    }
}