package leetCode;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String[] args) {
	
		int [] nums1 = {1,2,3,0,0,0};
		int [] nums2 = {2,5,6};
		int m = 3;
		int n = 3;
		
		merge(nums1, m, nums2, n);
		
	}
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

    	int i = m+n-1;
    	m --;
    	n--;
    	System.out.println(i);
    	
    	while(i>=0) {
    		if(m<0) {
    			nums1[i] = nums2[n--];
    		}else if(n<0) {
    			nums1[i] = nums1[m--];
    		}
    		else {
    			
    			if(nums1[m] > nums2[n]) {
    				nums1[i] = nums1[m--];
    			}
    			else {
    				nums1[i] = nums2[n--];
    			}
    		}
    		i--;
    	}
    		System.out.println(Arrays.toString(nums1));
    }
}
