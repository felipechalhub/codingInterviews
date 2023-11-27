package hackerRank;

import java.util.Arrays;

public class JumpingOnClouds {
    public static void main(String[] args) {
        int [] c = {1,1,1,0,1,1,0,0,0,0,0};
        int k = 3;
        System.out.println(jumpingOnClouds(c, k));
    }

    static int jumpingOnClouds(int[] c, int k) {
        int [] ar = new int [c.length+1];
        for (int i = 0; i < ar.length-1; i++) {
            ar[i] = c[i];
        }
        ar[ar.length-1] = c[0];

        int ans = 99;
        for (int i = k; i < ar.length; i+=k) {
            if(ar[i] == 0)
                ans--;
            else{
                ans-=3;
            }
        }
        return ans;
    }
}
