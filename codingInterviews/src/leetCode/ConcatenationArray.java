package leetCode;

import java.util.Arrays;

public class ConcatenationArray {
	public static void main(String[] args) {
		
		int[] array = {1,2,1};
		
		System.out.println(Arrays.toString(getConcatenation(array)));
		
	}
    public static int[] getConcatenation(int[] nums) {
    	int size = nums.length;
    	int [] ans = new int[size*2];
    	
    	for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
		}
    	int index = nums.length;
    	for (int i = 0; i < nums.length; i++) {
    		ans[index] = nums[i];
    		index++;
			
		}
    	
		return ans;
        
    }
}
