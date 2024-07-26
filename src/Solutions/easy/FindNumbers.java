package Solutions.easy;

import java.util.ArrayList;
import java.util.List;

public class FindNumbers {
    /*
    Given an array nums of n integers where nums[i] is in the range [1, n],
    return an array of all the integers in the range [1, n] that do not appear in nums.
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
            nums[(Math.abs(nums[i]) - 1)]=-(Math.abs(nums[(Math.abs(nums[i]) - 1)]));

        for(int i =0;i<nums.length;i++)
            if(nums[i]>0)
                list.add(i+1);
        return list;
    }
}
