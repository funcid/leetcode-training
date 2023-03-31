class Solution {
    public void rotate(int[] nums, int k) {
      
        int[] out = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            out[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = out[i];
        }
    }
}