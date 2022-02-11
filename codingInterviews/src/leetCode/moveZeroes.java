package leetCode;

import java.util.Arrays;

public class moveZeroes {
	public static void main(String[] args) {
	int [] nums = {0,1,0,3,12};
	moveZeroes(nums);
	
	}
    public static void moveZeroes(int[] nums) {
        int sorted = 0;
        for (int i = 0; i < nums.length; i++){			//loop through array
            if (nums[i] != 0) {							//if the int is not 0
                nums[sorted++] = nums[i];				//add the int to sorted which starts at 0. Increment sorted by 1 so we can keep track of how
                										//many ints have been added to the beggining of the array
            } 
        } 
        for (int i = sorted; i < nums.length; i++){		//since we know exactly how many ints have been added to the beginning of the array, we can set i to that
            nums[i] = 0;								//this way we loop from the last non zero to the end of the array and set it to 0
        } 
        System.out.println(Arrays.toString(nums));
    }
}
