package leetCode2;

import java.util.HashMap;

public class Q2 {
	

	public static void main(String[] args) {
		int D = 4;
		String S = "two";
		
		System.out.println(solution(D,S));
		
		
	}
    public static int solution(int D, String S) {
    	
//    	int sInt =0;
    	
    	HashMap<String, Integer> map = new HashMap<>();
    	map.put("one", 1);
    	map.put("two", 2);
    	map.put("three",3);
    	map.put("four", 4);
    	map.put("five", 5);
    	
   		int day = map.get(S);
    	
    	int ans = day * D;
    	
    	
    	return ans;
    }

}
