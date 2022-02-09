package leetCode;

public class SearchInsert {
	public static void main(String[] args) {
		int [] nums = {1,3,5,6};
		int target = 5;
		System.out.println(searchInsert(nums, target));
	}

    public static int searchInsert(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){		//since the array is already sorted, we just need to find the first index where target<=i and return i
            if(target<=nums[i]){
                return i;
            }
        }
    return nums.length;							//if the target is outside the array, then return the length which in the case is 4
        
    }
}
