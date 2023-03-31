class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int max = 0;

        for (int x : set) {

            int y = x + 1;

            if (!set.contains(x - 1)) {

                while (set.contains(y)) {
                    y++;
                }
                max = Math.max(max, y - x);
            }
        }

        return max;
    }
}