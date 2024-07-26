package Solutions;

import java.util.Arrays;

public class ThirdMaxNumber {
    /*
    Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
     */
    public int thirdMax(int[] nums) {
        if(nums.length==1)
            return nums[0];
        Arrays.sort(nums);
        int firstMax=nums[nums.length-1];
        int max = firstMax;
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=max){
                count++;
                max=nums[i];
            }
            if(count==2)
                return max;
        }
        return firstMax;
    }
}
