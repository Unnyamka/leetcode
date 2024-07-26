package Solutions.easy;

public class TwoSum {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
     */
    public int[] twoSum(int[] nums, int target) {
        int first = 0, second = 0;

        for(int i =0;i<nums.length;i++){
            first=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[first])
                    return new int[]{first, j};
            }

        }

        return new int[]{};

    }

}
