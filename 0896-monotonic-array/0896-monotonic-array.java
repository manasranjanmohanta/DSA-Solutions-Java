class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isMonotoneIncreasing = false;
        boolean isMonotoneDecreasing = false;

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                isMonotoneIncreasing = true;
            }
            if (nums[i] > nums[i + 1]) {
                isMonotoneDecreasing = true;
            }
        }

        if (isMonotoneIncreasing == true && isMonotoneDecreasing == true) {
            return false;
        }
        return true;
    }
}