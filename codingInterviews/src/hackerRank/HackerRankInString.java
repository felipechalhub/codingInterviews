package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class HackerRankInString {
    public static void main(String[] args) {
        System.out.println(hackerrankInString("hereiamstackerrank"));
    }
    public static String hackerrankInString(String s) {
        String hacker = "hackerrank";
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == hacker.charAt(j)){
                j++;
                if(j == 10)
                    return "YES";
            }
        }
    return "NO";
    }
}
