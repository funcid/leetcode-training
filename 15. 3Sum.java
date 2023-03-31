class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> trios = new ArrayList<>();

        Arrays.sort(nums); 

        for (int i = 0; i < nums.length - 1; i++) {

            int num = nums[i];

            if (i > 0 && num == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;

            while (l < r) {

                int ln = nums[l], lr = nums[r];

                if (ln + lr + num == 0) {
                    List<Integer> trio = new ArrayList<Integer>();
                    trio.add(num);
                    trio.add(ln);
                    trio.add(lr);
                    trios.add(trio);

                    l++;

                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                } 
                if (ln + lr + num >= 0) {
                    r--;
                } else if (ln + lr + num < 0) {
                    l++;
                }
            }
        }

        return trios;
    }
}