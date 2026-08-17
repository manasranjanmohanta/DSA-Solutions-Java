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

// SOLUTION - 2 (BY DECIDING DIRECTION)

// class Solution {
//     public boolean isMonotonic(int[] nums) {
//         int direction = 0;

//         int n = nums.length;
//         for (int i = 0; i < n - 1; i++) {
//             if(nums[i] < nums[i+1]){
//                 if(direction == 0){
//                     direction = 1;
//                 } else if (direction == -1){
//                     return false;
//                 }
//             } else if (nums[i] > nums[i+1]){
//                 if(direction == 0){
//                     direction = -1;
//                 } else if (direction == 1){
//                     return false;
//                 }
//             }
//         }
//     return true;
//     }
// }