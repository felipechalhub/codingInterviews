package codeSignal;

import java.util.Arrays;

public class AlternatingSums {

	public static void main(String[] args) {
		int[] a = { 50, 60, 60, 45, 70 };
		System.out.println(Arrays.toString(solution(a)));
	}

	public static int[] solution(int[] a) {
		int sumA = 0;
		int sumB = 0;

		for (int i = 0; i < a.length; i++) {
			if (i == 0)
				sumA += a[i];
			else if (i % 2 != 0)
				sumB += a[i];
			else
				sumA += a[i];
		}
		int[] ans = new int[2];
		ans[0] = sumA;
		ans[1] = sumB;
		return ans;
	}
}
