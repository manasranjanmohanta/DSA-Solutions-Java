package LeetCodeSolutions;

import java.util.Arrays;

public class Solution189BestApproach {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        if(k > nums.length){
            k = k % nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }
    public static void reverse(int[] nums, int low, int high){
        while(low < high){
            swap(nums,low, high);
            low++;
            high--;
        }
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
