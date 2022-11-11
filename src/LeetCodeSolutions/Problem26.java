// Beats 100% (optimised solution) and two pointer approach
package LeetCodeSolutions;

public class Problem26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0,0};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }

    private static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;

        while (fast < nums.length) {
            if (nums[fast] > nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }

            fast++;
        }

        return slow + 1;
    }

}
