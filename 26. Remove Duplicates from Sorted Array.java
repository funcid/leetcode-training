class Solution {
    public int removeDuplicates(int[] nums) {
        
        int duplicate = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                duplicate++;
            } else {
                nums[i - duplicate] = nums[i];
            }
        }

        return nums.length - duplicate;
    }
}