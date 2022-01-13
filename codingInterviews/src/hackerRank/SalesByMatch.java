package hackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SalesByMatch {

	public static void main(String[] args) {
		
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(1);
		ar.add(2);
		ar.add(1);
		ar.add(3);
		ar.add(2);
//		{1,2,1,2,1,3,2};
		System.out.println(sockMerchant(7, ar));
	}
    public static int sockMerchant(int n, List<Integer> ar) {
		int count = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if(set.contains(ar.get(i))) {
				set.remove(ar.get(i));
				count++;
			}else {
				set.add(ar.get(i));
			}
		}
		return count;

    }

}
