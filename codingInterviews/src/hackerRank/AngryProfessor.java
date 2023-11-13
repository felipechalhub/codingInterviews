package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AngryProfessor {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(Arrays.asList(-2, -1, 0 , 1, 2));
        System.out.println(angryProfessor(3, a));
    }


    public static String angryProfessor(int k, List<Integer> a) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
        if(a.get(i)<1)
            count++;
        }
        if(count>=k)
            return "NO";

        return "YES";
    }
}
