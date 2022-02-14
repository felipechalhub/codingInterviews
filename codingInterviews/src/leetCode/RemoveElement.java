package leetCode;

import java.util.Arrays;

public class RemoveElement {
	public static void main(String[] args) {
	int [] nums = {0,1,2,2,3,0,4,2};
	int val = 2;
	
	System.out.println(removeElement(nums,val));
	
	}
    public static int removeElement(int[] nums, int val) {
    	int final_size = 0;
    	
    	for (int i = 0; i < nums.length; i++) {	//2,2,2,3
			if(nums[i] != val) {
				nums[final_size] = nums[i] ;
				final_size++;				//2
			}
		}
		return final_size;
        
    }
}
