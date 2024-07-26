package Solutions;

public class MoveZeroes {
    /*
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    Note that you must do this in-place without making a copy of the array.
     */

    public static void moveZeroes(int[] nums) {
        int zeros = 0;
        for(int i=0;i<nums.length-zeros;i++){
            if(nums[i]==0){
                for(int j=i;j<nums.length-zeros-1;j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-zeros-1] = 0;
                zeros++;
                i--;
            }
        }
    }
}
