package leetCode2;

import java.util.Arrays;

public class SmallestInt {
	public static void main(String[] args) {
		
		int [] A = {1, 3, 6, 4, 1, 2};
		System.out.println(solution(A));
	}
    public static int solution(int[] A) {
    	
    	int smallestUnit = 1;
    	
    	Arrays.sort(A);
    	
    	for (int i = 0; i < A.length; i++) {
			if(A[i] == smallestUnit)
				smallestUnit++;
		}

		return smallestUnit;
    }
}
