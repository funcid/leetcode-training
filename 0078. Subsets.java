class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> out = new ArrayList<>();

        for (int i = 0; i < 1 << nums.length; i++) {
            
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < nums.length; j++) {

                if (((i >> j) & 1) == 1) {

                    list.add(nums[j]);
                }
            }

            out.add(list);
        }

        return out;
    }
}