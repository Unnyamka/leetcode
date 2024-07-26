package Solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortByFrequency {
    /*
    Given an array of integers nums, sort the array in increasing order based on the frequency of the values.
    If multiple values have the same frequency, sort them in decreasing order.
    Return the sorted array.
     */
    public int[] frequencySort(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Integer) nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if(map.get(a).equals(map.get(b))) {
                    return b - a;
                }
                return map.get(a) - map.get(b);
            }
        });
        return Arrays.stream(arr).mapToInt(Integer::valueOf).toArray();
    }
}
