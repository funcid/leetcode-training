class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0, right = nums.length - 1;

        if (target <= nums[left]) return 0;
        if (target > nums[right]) return nums.length;

        int index = left + (right - left) / 2;

        // 1 <= 0 ? no
        while (left <= right) {
            int num = nums[index]; // nums[0] = 1

            // 1 == 2 ? no
            if (num == target) { 
                return index;
            }
            if (target >= num) { // 2 >= 1 ? yes 
                left = index + 1; // 0 + 1 = 1
            } 
            if (target < num) { // 2 < 1 ? yes
                right = index - 1; // 1 - 1 = 0
            }

            // x = 0 + (0 - 0) / 2 = 0
            index = left + (right - left) / 2;
        }

        return index;
    }
}