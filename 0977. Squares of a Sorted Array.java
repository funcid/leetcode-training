class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int left = 0, right = nums.length - 1;
        int[] out = new int[nums.length];
        int i = nums.length;

        while (i > 0) {
            i--;

            int leftNum = nums[left];
            int rightNum = nums[right];

            if (leftNum * leftNum >= rightNum * rightNum) {

                out[i] = leftNum * leftNum;
                left++;
            } else {

                out[i] = rightNum * rightNum;
                right--;
            }
        }

        return out;
    }
}