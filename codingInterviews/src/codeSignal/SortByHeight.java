package codeSignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByHeight {

	public static void main(String[] args) {
		
		int [] a = {-1, 150, 190, 170, -1, -1, 160, 180};
 		System.out.println(Arrays.toString(solution(a)));
		
	}
	public static int[] solution(int[] a) {
		int [] temp = a.clone();
		Arrays.sort(a);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if(a[i] != -1)
				list.add(a[i]);
		}

		int j = 0;
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] != -1) {
				temp[i] = list.get(j);
				j++;
			}
		}
		return temp;
	}
}
