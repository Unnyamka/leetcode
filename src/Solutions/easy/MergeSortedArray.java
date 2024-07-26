package Solutions.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortedArray {
    /*
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
    and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
     and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     */

    public static void  merge(int[] nums1, int m, int[] nums2, int n) {
        int pos1 = m - 1;
        int pos2 = n - 1;
        int pos = m + n - 1;

        while (pos2 >= 0) {
            if (pos1 >= 0 && nums1[pos1] > nums2[pos2]) {
                nums1[pos--] = nums1[pos1--];
            } else {
                nums1[pos--] = nums2[pos2--];
            }
        }
    }
}
