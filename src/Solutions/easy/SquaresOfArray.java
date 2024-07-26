package Solutions.easy;

public class SquaresOfArray {
    /*
    Given an integer array nums sorted in non-decreasing order,
    return an array of the squares of each number sorted in non-decreasing order.
     */
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for(int i =0, j = nums.length-1, k = nums.length-1; i<=j;--k){
            if(nums[i]*nums[i] > nums[j]*nums[j]){
                result[k] = nums[i]*nums[i];
                i++;
            }
            else{
                result[k] = nums[j]*nums[j];
                j--;
            }
        }
        return result;
    }
}
