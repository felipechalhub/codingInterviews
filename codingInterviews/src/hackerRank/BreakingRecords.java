package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BreakingRecords {

    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        Collections.addAll(scores, 10, 5, 20, 20, 4, 5, 2, 25, 1);
        System.out.println(breakingRecords(scores));

    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> ans = new ArrayList<>();
        ans.add(scores.get(0));
        ans.add(scores.get(0));

        int max = 0;
        int min = 0;

        for (int i = 1; i < scores.size(); i++) {
            if(ans.get(0) < scores.get(i)){
                ans.set(0, scores.get(i));
                max++;
            }
            else if (ans.get(1) > scores.get(i)){
                ans.set(1, scores.get(i));
                min++;
            }
        }
        List<Integer> ans2 = new ArrayList<>();
        ans2.add(max);
        ans2.add(min);
        return ans2;
    }
}
