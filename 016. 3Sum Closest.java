class Solution {
    public int threeSumClosest(int[] nums, int target) {

        if (nums.length == 3) return nums[0] + nums[1] + nums[2];

        Integer closest = null;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int x = nums[i];
            int l = i + 1, r = nums.length - 1;

            while (l < r) {

                int left = nums[l], right = nums[r];
                int S = x + left + right;

                if (closest == null || Math.abs(S - target) < Math.abs(target - closest)) {
                    closest = S;
                } 
                if (S <= target) {
                    l++;
                }
                if (S >= target) {
                    r--;
                }
            }
        }

        return closest;
    }
}