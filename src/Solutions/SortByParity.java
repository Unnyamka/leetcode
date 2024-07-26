package Solutions;

public class SortByParity {

    /*
    Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
    Return any array that satisfies this condition.
     */
    public int[] sortArrayByParity(int[] nums) {

        for(int i=0;i<nums.length-1;i++)
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]%2!=0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        return nums;
    }
}
