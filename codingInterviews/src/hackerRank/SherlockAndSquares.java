package hackerRank;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

public class SherlockAndSquares {
    public static void main(String[] args) {
        System.out.println(squares(24,1000000));
    }

    public static int squares(int a, int b) {
        // Write your code here
        int num = 0;
        for (int i = a; i <= b; i++) {
            int sq = 0;
            sq = (int)Math.sqrt(i);
            if((sq *sq) == i)
                num++;
        }

        return num;
//        int sq_a = (int) Math.ceil( Math.sqrt(a) );
//        int sq_b = (int) Math.sqrt(b);
//
//        return sq_b - sq_a +1 ;
    }
}

