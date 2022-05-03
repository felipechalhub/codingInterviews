package leetCode2;

public class RemoveElement {

	public static void main(String[] args) {
		
		int[] nums  = {0,1,2,2,3,0,4,2};
		int val = 0;
		System.out.println(removeElement(nums, val));
	}
    public static int removeElement(int[] nums, int val) {
    	int final_size = 0;
    	for (int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[final_size] = i;
				final_size++;
			}
		}
		return final_size;

    }
    
}
