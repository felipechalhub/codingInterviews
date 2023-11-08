package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesByMatch2 {
    public static void main(String[] args) {
        List<Integer> ar = Arrays.asList(1,2,1,2,1,3,2,1);
        System.out.println(sockMerchant(8, ar));

    }
    public static int sockMerchant(int n, List<Integer> ar) {
        int count = 0;
        List<Integer> set = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(set.contains(ar.get(i)))
            {
                set.remove(ar.get(i));
                count++;
            }
            else
            {
                set.add(ar.get(i));
            }
        }
        return count;
    }

}
