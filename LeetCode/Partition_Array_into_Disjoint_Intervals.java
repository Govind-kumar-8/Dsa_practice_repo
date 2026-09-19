package Dsa_practice.LeetCode;

public class Partition_Array_into_Disjoint_Intervals {

	public static void main(String[] args) {
		int[] arr = {5,0,3,8,6};
		System.out.println(partitionDisjoint(arr));
	}
	public static  int partitionDisjoint(int[] nums) {
	    int n = nums.length;
	    int[] left = new int[n];
	    int[] right = new int[n];
	    
	    left[0] = nums[0];
	    for(int i =1; i<n; i++) {
	    	left[i] = Math.max(left[i-1], nums[i]);
	    }
	    right[n-1] = nums[n-1];
	    for(int i=n-2; i>=0; i--) {
	    	right[i] = Math.min(right[i+1], nums[i]);
	    }
	   
	    for(int i=0; i<n-1; i++) {
	    	if(left[i]<=right[i+1]) {
	    			return i+1;
	    		}
	    }
	    if(left[n-2]<=right[n-1]) {
	    	return n-1;
	    }
	    
	  return -1;
	    }
}
