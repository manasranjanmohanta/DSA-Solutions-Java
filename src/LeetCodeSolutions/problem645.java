//645. Set Mismatch
//
//You have a set of integers s, which originally contains all the numbers
// from 1 to n. Unfortunately, due to some error, one of the numbers in s
// got duplicated to another number in the set, which results in repetition
// of one number and loss of another number.You are given an integer array
// nums representing the data status of this set after the error.
// Find the number that occurs twice and the number
// that is missing and return them in the form of an array.
//        Example 1:
//
//        Input: nums = [1,2,2,4]
//        Output: [2,3]
package LeetCodeSolutions;

import java.util.Arrays;

public class problem645 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    private static int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length];
        int[] res = new int[2];

//        for(int i : nums){
//            arr[i - 1]++;
//        }
        for(int i : nums){
            arr[i - 1]++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                res[0] = i+1;
            }
            if(arr[i] == 0){
                res[1] = i+1;
            }
        }
        return res;
    }
}
