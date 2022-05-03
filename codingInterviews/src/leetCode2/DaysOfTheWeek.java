package leetCode2;

import java.util.ArrayList;
import java.util.HashMap;

public class DaysOfTheWeek {
	
	public static void main(String[] args) {

		String S = "Wed";
		int K = 2;
//		int x = 52%7;
//		System.out.println(x);
		System.out.println(solution(S,K));
	}
    public static String solution(String S, int K) {
    	
    	HashMap<String, Integer> days = new HashMap<>();
    	days.put("Mon", 0);
    	days.put("Tue", 1);
    	days.put("Wed", 2);
    	days.put("Thu", 3);
    	days.put("Fri", 4);
    	days.put("Sat", 5);
    	days.put("Sun", 6);

    	
    	int rem = K%7;
    	int day = days.get(S);
    	int a;
    	
    	int answer = rem+day;
    	if(answer>6)
    		a = answer-7;
    	else
    		a = answer;
    	
    	
    	String [] arr = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
    	return arr[a];
    	
    		
    	
    }
}
