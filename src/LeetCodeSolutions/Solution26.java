package LeetCodeSolutions;

public class Solution26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0,0};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int j = 1;
        if(nums.length == 2){
            if(nums[0] != nums[1]){
                return 2;
            }
            else  return 1;
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (j < nums.length) {
                    while (j < nums.length && nums[i] == nums[j] ) {
                        j++;
                    }
                    if(j < nums.length){
                        nums[i + 1] = nums[j];
                        count++;
                        j++;
                    } else {
                        break;
                    }
                }
                }
            }
        return count;
    }
}
