package Solutions.easy;

import java.util.Arrays;

public class ContainsDuplicate {
    /*
    Given an integer array nums, return true if any value appears at least twice in the array,
     and return false if every element is distinct.
     */

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
            if(nums[i]==nums[i-1])
                return true;
        return false;
    }
}
