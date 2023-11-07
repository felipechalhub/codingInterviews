package leetCode2;

import java.util.Arrays;

public class plusOne {

	public static void main(String[] args) {

		int[] digits = { 9,9 };
		System.out.println(Arrays.toString(plusOne(digits)));

	}

	public static int[] plusOne(int[] digits) {
		int lastDigits = digits.length;
		
		for (int i = lastDigits-1; i >=0; i--) {
			if(digits[i] != 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;

		}
		int [] ans = new int[lastDigits+1];
		ans[0] = 1;
		return ans;
	}

}
