package google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HasPairWithSum {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        Collections.addAll(ar, 1,2,3,9);
        System.out.println(HasPairWithSum(ar, 8));
    }

    public static boolean HasPairWithSum(List<Integer> ar, int i) {
        int lo = ar.get(0);
        int loIndex = 0;
        int hi = ar.get(ar.size()-1);
        int hiIndex = ar.size();

        while(lo <= hi){
            int num = lo + hi;
            if(num < i)
            {
                loIndex++;
                lo = ar.get(loIndex);
            }
            else if(num > i)
            {
                hiIndex--;
                hi = ar.get(hiIndex);
            }
            else return true;
        }
        return false;
    }

}
