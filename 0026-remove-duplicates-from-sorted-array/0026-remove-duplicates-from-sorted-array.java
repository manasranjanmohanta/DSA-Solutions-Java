class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[j] > nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}