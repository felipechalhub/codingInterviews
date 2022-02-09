package leetCode;

import java.util.Arrays;

public class SingleNumber {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 3, 2 };
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		//XOR rules:
		//a^a = 0
		//a^0 = a
		//a^b = b^a
		//a^(b^c) = (a^b)^c
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;
	}
	//Explanation for array 1,2,3,3,2
	// 1^2^3^3^2 = 1^2^2^3^3
	// 1^2^2^3^3 = 1^0^0
	// 1^0^0 = 1
}
