package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {
        List<Integer> a =  new ArrayList<>();
        Collections.addAll(a,1,2,3);
        List<Integer> b =  new ArrayList<>();
        Collections.addAll(b,3,2,1);

        System.out.println(compareTriplets(a,b));
    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aScore = 0;
        int bScore = 0;
        List<Integer> c =  new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i))
                aScore++;
            else if (a.get(i) < b.get(i))
                bScore++;
        }
        Collections.addAll(c, aScore, bScore);
        return c;
    }
}
