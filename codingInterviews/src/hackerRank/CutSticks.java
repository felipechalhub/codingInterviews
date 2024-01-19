package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutSticks {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 5, 4, 4, 2, 8, 2);
        System.out.println(cutTheSticks(arr));
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int arrSize = arr.size();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) < min){
                min = arr.get(i);
            }
            if(arr.get(i) > max){
                max = i;
            }
        }

        int i = 0;
        while(arr.get(max) != 0) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) != 0) {
                    arr.set(j, arr.get(j) - min);
                    i++;
                }
            }
            for (int k = 0; k < arr.size(); k++) {
                if (arr.get(k) < min && arr.get(k) !=0) {
                    min = arr.get(k);
                }
            }

                if(arr.size() == 1){
                    ans.set(ans.size(), ans.get(ans.size())+1);
                }
                ans.add(i);
                i=0;
        }
        return ans;
    }
}
