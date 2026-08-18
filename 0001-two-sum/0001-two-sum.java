// APPROACH - 1 (BRUTE FORCE)
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;

//         // if the array length is exactly 2
//         if (n == 2) {
//             return new int[] { 0, 1 };
//         }

//         // if the array length is larger than 2
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[] { i, j };
//                 }
//             }
//         }

//         return new int[] {};
//     }
// }

// APPROACH - 2 (USING TWO-PASS HASH TABLE MEANS FIRST ADD AND THEN ITERATE THE COLLECTION)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // ADD VALUE AS KEY AND INDEX AS VALUE
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // ITERATE THE ARRAY AND FIND THE COMPLEMENT AND CHECK IF IT IS PRESENT IN HASH TABLE OR NOT
        for (int i = 0; i < nums.length; i++) {
            int complementValue = target - nums[i];
            if (map.containsKey(complementValue) && map.get(complementValue) != i) {
                return new int[] {i, map.get(complementValue)};
            }
        }

        // ELSE RETURN EMPTY ARRAY
        return new int[] {};
    }
}
