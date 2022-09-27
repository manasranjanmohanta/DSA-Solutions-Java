package LeetCodeSolutions;

import java.util.Arrays;

public class Solution283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n < 2){
            return;
        }
        int s1 = 0;
        int s2 = 1;
        while(s2 < n){
            if(nums[s1] != 0){
                s1++;
                s2++;
            }
            else if(nums[s2] == 0){
                s2++;
            }
            else{
                int temp = nums[s1];
                nums[s1] = nums[s2];
                nums[s2] = temp;
            }
        }
    }
}
