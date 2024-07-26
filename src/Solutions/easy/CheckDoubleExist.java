package Solutions.easy;

public class CheckDoubleExist {

    /*
    Given an array arr of integers, check if there exist two indices i and j such that :

    i != j
    0 <= i, j < arr.length
    arr[i] == 2 * arr[j]


     */
    public boolean checkIfExist(int[] arr) {
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
                if(arr[j]*2==arr[i] || arr[i]*2==arr[j])
                    return true;
        }
        return false;
    }
}
