package Solutions.easy;

public class PlusOne {
    /*
    You are given a large integer represented as an integer array digits,
    where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order.
     The large integer does not contain any leading 0's.
     Increment the large integer by one and return the resulting array of digits.
     */

    public static void main(String[] args) {
        PlusOne plusOne=new PlusOne();
        plusOne.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
    }
    public int[] plusOne(int[] digits) {
        int dop = 0;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+1>=10 && i==0)
                dop++;
            if(digits[i]+1<10) {
                digits[i]++;
                break;
            }
            digits[i]=0;
        }
        int[] result = new int[digits.length+dop];
        for(int i = digits.length-1;i>=0;i--)
            result[i] = digits[i];
        if(dop>0)
            result[0] = 1;
        return result;
    }
}
