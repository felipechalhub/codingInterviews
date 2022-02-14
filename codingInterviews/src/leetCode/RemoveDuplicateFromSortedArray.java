package leetCode;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
	public static void main(String[] args) {
		
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(removeDuplicates(nums));
		
	}
    public static int removeDuplicates(int[] nums) {
    	int count = 1;
    	
    	for (int i = 0; i < nums.length-1; i++) {
    		if(nums[i] != nums[i+1]) {
    			nums[count] = nums[i+1];
    			count++;
    		}
		}
		return count;
    }
}
//0,1,2,3,4,2,2,3,3,4