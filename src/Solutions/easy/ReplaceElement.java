package Solutions.easy;

public class ReplaceElement {

    /*
    Given an array arr, replace every element in that array with the greatest element among the elements to its right,
     and replace the last element with -1.
     */
    public int[] replaceElements(int[] arr) {
        for(int i =0;i<arr.length;i++){
            if(i==arr.length-1){
                arr[i] = -1;
                break;
            }
            int max = arr[i+1];
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]>max)
                    max=arr[j];
            }
            arr[i]=max;
        }
        return arr;
    }
}
