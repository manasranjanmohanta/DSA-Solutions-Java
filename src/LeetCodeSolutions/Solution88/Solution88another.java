package LeetCodeSolutions.Solution88;

import java.util.Arrays;

public class Solution88another {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                k++;
                i++;
            } else {
                result[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            result[k] = nums1[i];
            k++;
            i++;
        }
        while (j < n) {
            result[k] = nums2[j];
            k++;
            j++;
        }


        for (int l = 0; l < m + n; l++) {
            nums1[l] = result[l];
        }
    }
}
