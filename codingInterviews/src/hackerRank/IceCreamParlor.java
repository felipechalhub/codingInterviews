package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IceCreamParlor {
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();
        Collections.addAll(arr, 1,3,4,5,6);
        System.out.println(icecreamParlor(6,arr));
    }
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        List<Integer> ans= new ArrayList<>();
        int j = 1;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) + arr.get(j) == m){
                Collections.addAll(ans, arr.get(i), arr.get(j));
            }
            else{
                j++;
            }
        }
        return ans;
    }
}
