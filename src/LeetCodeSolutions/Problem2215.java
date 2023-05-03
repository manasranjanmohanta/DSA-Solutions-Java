package LeetCodeSolutions;

import java.util.*;

public class Problem2215 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println(findDifference(nums1, nums2));

    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int element : nums1){
            set1.add(element);
        }
        for(int element : nums2){
            set2.add(element);
        }

        for(int element : set1){
            if(set2.contains(element) == false){
                list1.add(element);
            }
        }
        for(int element : set2){
            if(set1.contains(element) == false){
                list2.add(element);
            }
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(list1);
        result.add(list2);
        return result;
    }
}
