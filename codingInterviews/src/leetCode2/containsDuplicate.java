package leetCode2;

public class containsDuplicate {

	public static void main(String[] args) {

		int [] nums = {1,1,0,0};
		System.out.println((findMaxConsecutiveOnes(nums)));
		
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1 )
			{
				max++;
			}

		}
		return max;
	}

}
