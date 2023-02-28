class Solution {
    
    public int[] twoSum(int[] nums, int target) {

        int[][] map = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) 
            map[i] = new int[]{ nums[i], i };

        Arrays.sort(map, (x, y) -> x[0] > y[0] ? 1 : -1);

        int i = 0, j = nums.length - 1; 
        int di = 0, dj = 0; 

        while (i <= j) {
            di = map[i][1]; dj = map[j][1];
            if (map[i][0] + map[j][0] == target) break;
            if (map[i][0] + map[j][0] > target) j--;
            else i++;
        }
        return new int[] { di, dj };
    }
}