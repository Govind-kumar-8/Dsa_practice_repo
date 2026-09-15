package Dsa_practice.LeetCode;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] arr =productExceptSelf(nums);
		for(int i = 0; i<nums.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

   public static int[] productExceptSelf(int[] nums) {
	   int n = nums.length;
	   int res[] = new int[n];
	   //prefix
	   int left[] = new int[n];
	   left[0] = 1;
	   for(int i=1; i<n; i++) {
		  left[i] = left[i-1]*nums[i-1];
	   }
	   //suffix
	   int[] right = new int[n];
	   right[n-1] = 1;
	   for(int i=n-2; i>=0; i--) {
		   right[i] = right[i+1]*nums[i+1];
	   }
	   //calculation
	   for(int i =0; i<n; i++) {
		   nums[i] = left[i]*right[i];
	   }
	   return nums;
   }

}
