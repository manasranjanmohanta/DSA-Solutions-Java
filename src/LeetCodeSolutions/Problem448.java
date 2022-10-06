package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.List;
public class Problem448 {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int i = 0;
            while(i < nums.length){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }
                else{
                    i++;
                }
            }
            List<Integer> li = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index + 1){
                    li.add(index + 1);
                }
            }
            return li;
        }
        void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
}

