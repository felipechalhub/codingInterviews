package leetCode;

public class MajorityElement {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 3 };
		System.out.println(majorityElement(nums));
	}
	//DISCLAIMER: this algorithm only works if the majority element always exists and that was specified in the prompt
	public static int majorityElement(int[] nums) {
		int counter = 1;
		int candidate = nums[0]; 
		
		for (int i = 1; i < nums.length; i++) {
			if(counter == 0)
				candidate = nums[i];
			if(nums[i] == candidate) {
				counter++;
			}else {
				counter--;
			}
		}
		return candidate;

	}
}
