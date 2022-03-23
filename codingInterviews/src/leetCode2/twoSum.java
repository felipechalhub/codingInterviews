package leetCode2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
	public static void main(String[] args) {

		int[] nums = { 3,2,4 };
		int target = 6;

		System.out.println(Arrays.toString(twoSum(nums, target)));
	

	}
//BRUTE FORCE
//	public static int[] twoSum(int[] nums, int target) {
//		int [] ans = new int [2];
//		for (int i = 0; i < nums.length - 1; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] + nums[j] == target) {
//					ans[0] = i;
//					ans[1] = j;
//					return ans;
//				}
//			}
//		}
//		return ans;
//
//	}
	
//FASTER
	public static int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> num_map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			int complement  = target - nums[i];
			
			if(num_map.containsKey(complement)) {
				int ans[] = {num_map.get(complement), i};
				return ans;
			}
			num_map.put(nums[i], i);
		}

		// 3 -> 0
		// 4 -> 1
		// 2 -> 2
		
		return new int [] {0,0};
		
	}

}
