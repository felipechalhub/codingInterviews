package leetCode;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
	public static void main(String[] args) {
	
		int [] nums = {1,2,3,4};
		System.out.println(containsDuplicate(nums));
		
	}

	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> numbers = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			if(numbers.contains(nums[i])) 
				return true;
			else
				numbers.add(nums[i]);
		}
		return false;
		
		//ALTERNATIVE SOLUTION --> SORT AND THEN CHECK FOR THE NEXT INDEX
//		Arrays.sort(nums);
//		for (int i = 0; i < nums.length-1; i++) {
//			if(nums[i] == nums[i+1])
//				return true;
//		}
//		return false;
	}
	
}
