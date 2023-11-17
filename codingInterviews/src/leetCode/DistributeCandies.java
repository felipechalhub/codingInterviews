package leetCode;

import java.util.ArrayList;
import java.util.List;

public class DistributeCandies {

    public static void main(String[] args) {

        int [] candyType = {6,6,6,6};
        System.out.println(distributeCandies(candyType));
    }
    public static int distributeCandies(int[] candyType) {
        int size = candyType.length/2;
        List<Integer> candy = new ArrayList<>();
        for (int i = 0; i < candyType.length; i++) {
            if (!candy.contains(candyType[i]))
                candy.add(candyType[i]);
        }

        if(size < candy.size())
            return size;
        else
            return candy.size();

    }

}
