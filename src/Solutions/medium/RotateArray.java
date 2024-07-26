package Solutions.medium;

public class RotateArray {
    /*
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     */

    public static void main(String[] args) {
        //[1,2,3,4,5,6,7], k=3;
        //[0,1,2,3,4,5,6]
        //[5,6,7,1,2,3,4]
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1,2,3,4,5,6,7},3);
    }
    private int[] nums;

    public void rotate(int[] nums, int k) {
        this.nums = nums;
        int n = nums.length;
        k %= n;
        reverse(0, n - 1);
        reverse(0, k - 1);
        reverse(k, n - 1);

        for(int num:nums)
            System.out.print(num+" ");
    }

    private void reverse(int i, int j) {
        for (; i < j; ++i, --j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
}
