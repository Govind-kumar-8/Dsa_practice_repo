package Dsa_practice.LeetCode;

import java.util.Iterator;

public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7};
		int k=3;
		rotate(nums, k);
		for(int i = 0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k%n;
		//1st sifted
		int j = 1;
		while(j<=k) {
		int temp = nums[n-1];
		for(int i = n-2; i>=0; i--) {
			nums[i+1] = nums[i];
		}
		nums[0]=temp;
		j++;
		}
	}

}
