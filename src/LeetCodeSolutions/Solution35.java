package LeetCodeSolutions;

public class Solution35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int res = searchInsert(nums, 5);
        System.out.println(res);
    }
        public static int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;
            if(target > nums[end]){
                return nums.length;
            }
            if(target < nums[start]){
                return start;
            }
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(target == nums[mid]){
                    return mid;
                }
                if(target < nums[mid]){
                    if((mid - 1) >= 0 && nums[mid - 1] < target){
                        return mid;
                    }
                    else{
                        end = mid - 1;
                    }
                }
                else{
                    start = mid + 1;
                }
            }
            if(start == nums.length - 1){
                return nums.length;
            }
            return -1;
        }
}
