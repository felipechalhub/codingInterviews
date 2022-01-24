package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

	public static void main(String[] args) {
	List<Integer> a = Arrays.asList(17,28,30);
	List<Integer> b = Arrays.asList(99,16,8);
	
	System.out.println(compareTriplets(a,b));

	}
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int aliceScore = 0;
		int bobScore = 0;
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i) > b.get(i))
				aliceScore++;
			else if(a.get(i) < b.get(i))
				bobScore++;				
		}
		List<Integer> result = new ArrayList<>();
		result.add(aliceScore);
		result.add(bobScore);
		return result;
	}
	
}
