class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0, j = 0;

        while (i < nums.length) {

            if (nums[i] != 0) {
                int num = nums[i];
                nums[i] = nums[j];
                nums[j] = num;
                j++;
            }
            i++;
        }

    }
}