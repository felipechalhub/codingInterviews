package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {

	public static void main(String[] args) {
		List <Integer> a = new ArrayList <Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(10);
		a.add(11);
		System.out.println(compareTriplets(a));
		
	}
	   public static int compareTriplets(List<Integer> a) {
		   int sum = 0;
		   for (int i = 0; i < a.size(); i++) {
			   sum += a.get(i);
		}
		   return sum;

		    }


}
