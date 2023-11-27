package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 11, 4, 11, 7, 13, 4, 12, 11, 10, 14);

        List<Integer> brr = new ArrayList<>();
        Collections.addAll(brr, 11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12);
        System.out.println(missingNumbers(arr, brr));
    }
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        for (int i = 0; i < arr.size(); i++) {
            if(brr.contains(arr.get(i))){
                brr.remove(arr.get(i));
            }

        }
        Collections.sort(brr);
    return brr;
    }
}
