package leetCode;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {

		int[] nums = { 0, 1, 2, 3, 4, 5, 7, 8, 9 };
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		// USING Arrays.sort
	
//		  Arrays.sort(nums); 								//sorting array
//		  if(nums[0] != 0)									//if nums[0] != 0, that means that the missing number is 0 because the array is sorted  									
//			  return 0;
//		  int i = 1;										//setting i = 1 outside the loop in case the array is {1}
//		  for (i = 1; i < nums.length; i++) {				
//			  if(nums[i] - nums[i-1] != 1) 					// if the difference between 2 indexes is not 1, that means that the missing number = 1
//				  return i; 
//			  }
//		  return i;
		 
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];								//finding the sum of the array
		}
		int n = nums.length;
		return n * (n + 1) / 2 - sum;					//pluging the sum into the formula
	}
}
