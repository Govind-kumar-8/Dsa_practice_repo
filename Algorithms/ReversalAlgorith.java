package Dsa_practice.Algorithms;

public class ReversalAlgorith {

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
		reverseInRange(nums, n-k, n-1);
		reverseInRange(nums, 0, n-k-1);
		reverseInRange(nums, 0, n-1);

		}
	public static void reverseInRange(int[] arr, int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}
