package leetCode;

public class MaximumSubarray {
	public static void main(String[] args) {
		int [] nums = {5,4,-1,7,8};
		System.out.println(maxSubArray(nums));
	}
    public static int maxSubArray(int[] nums) {
    	int max_sum = nums[0];		
    	int current_sum = max_sum;	
    	
    	for (int i = 1; i < nums.length; i++) {
    		current_sum = Math.max(nums[i] + current_sum, nums[i]); //5,4,-1,7,8
			max_sum =  Math.max(current_sum, max_sum);		//		
		}
		return max_sum;
    }
}
