package LeetCodeSolutions;

public class Problem53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0; int max = Integer.MIN_VALUE;
        for (int j = 0; j < nums.length; j++) {
            if(sum < 0){
                sum = 0;
            }
            sum = sum + nums[j];
            max = Math.max(max, sum);
        }
        return max;
    }
}
