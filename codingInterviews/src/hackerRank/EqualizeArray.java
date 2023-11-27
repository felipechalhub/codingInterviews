package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EqualizeArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList();
        Collections.addAll(arr, 3,3,2,1,3);
        System.out.println(equalizeArray(arr));
    }
    public static int equalizeArray(List<Integer> arr) {
        Collections.sort(arr);
        int num = 0;
        int count = 1;
        int max = 0;
        for (int i = 1; i < arr.size(); i++){
            if(arr.get(i) == arr.get(i-1))
            {
                count++;
                if(count>max){
                    max = count;
                }
            }
            else
            {
                num = arr.get(i-1);
                if(count>max){
                max = count;
                }
                count = 1;
            }
        }

        return arr.size()-max;
    }
}
