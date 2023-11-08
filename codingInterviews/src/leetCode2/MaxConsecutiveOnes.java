package leetCode2;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] nums = {1,1,0,0,0,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {

        int sum = 0;
        int max = 0;
        for (int i = 0; i<nums.length; i++){
            if(nums[i] == 1)
            {
                sum++;
                if(sum>=max)
                    max = sum;
            }
            else{
                sum = 0;
            }
        }
        return max;
    }
}
