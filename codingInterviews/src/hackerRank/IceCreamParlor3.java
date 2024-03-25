package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IceCreamParlor3 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 3, 4, 6, 7, 9);
        System.out.println(icecreamParlor(9,arr));
        //0,3
    }
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        List<Integer> flavors = new ArrayList<>();
        int dif;
        int low = 0;
        int high = arr.get(1);
        for (int i = 0; i < arr.size()-1; i++) {
            dif = m - arr.get(i);
            for (int j = i+1; j < arr.size(); j++) {
                if(arr.get(j) == dif){
                    high = j;
                    low = i;
                    break;
                }
            }
        }
        Collections.addAll(flavors, low+1, high+1);
        return  flavors;
    }
}
