package leetCode;

import java.util.ArrayList;
import java.util.List;

public class addDigits {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < nums.length+1; i++) {
            ans.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            if(ans.contains(nums[i])){
                ans.remove(nums[i]);
            }
        }
        return  ans;
    }
}
