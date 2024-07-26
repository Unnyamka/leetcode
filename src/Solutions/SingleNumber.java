package Solutions;

public class SingleNumber {

    /*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.
     */

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{4,1,2,1,2}));
    }

    public int singleNumber(int[] nums) {
        int num = nums[0];
        for(int i =1;i<nums.length;i++)
            num^=nums[i];
        return num;
    }
}
