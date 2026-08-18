class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        // if the array length is exactly 2
        if (n == 2) {
            return new int[]{0, 1};
        }

        // if the array length is larger than 2
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        
        return new int[0];
    }
}