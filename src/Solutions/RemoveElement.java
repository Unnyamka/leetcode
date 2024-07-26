package Solutions;

public class RemoveElement {

    /*
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
    Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
    The remaining elements of nums are not important as well as the size of nums.
    Return k.

     */
    public static int removeElement(int[] nums, int val) {
        if(nums==null || nums.length==0)
            return 0;
        int pointer = nums.length-1;
        for(int i =0;i<pointer;i++){

            if(nums[i]==val){
                nums[i] = nums[pointer];
                nums[pointer] = val;
                pointer--;
                i--;
            }
            if(nums[pointer] == val)
                pointer--;
        }
        int result=0;
        for(int i =0;i<nums.length;i++)
            if(nums[i]!=val)
                result++;
        return result;
    }
}
