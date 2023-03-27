class Solution {
    public int search(int[] nums, int target) {
        
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0] == target ? 0 : -1; 

        int left = 0, right = nums.length - 1;

        while (left <= right) {

            int index = (left + right) / 2;
            int num = nums[index];

            if (num == target) {
                return index;
            } else if (num > target) {
                right = index - 1;
            } else {
                left = index + 1;
            }
        }

        return -1;
    }
}