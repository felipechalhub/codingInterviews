package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMedian {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 5, 3, 1, 2, 4);
        System.out.println(findMedian(arr));
    }
    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size()/2);
    }
}
