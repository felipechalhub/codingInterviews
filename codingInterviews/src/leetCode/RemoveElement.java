package leetCode;

public class RemoveElement {
	public static void main(String[] args) {
	int [] nums = {3,2,2,3};
	int val = 3;
	
	System.out.println(removeElement(nums,val));
	
	}
    public static int removeElement(int[] nums, int val) {
    	int final_size = 0;
    	
    	
    	for (int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[final_size] = nums[i] ;
				final_size++;
			}
		}
    	
		return final_size;
        
    }
}
