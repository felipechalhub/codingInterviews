package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int [] nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        Arrays.sort(nums);
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        List <Integer> ans = new ArrayList<>();

        for (int i = 1; i <= list.size(); i++) {
            if(!list.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}
