package Dsa_practice.LeetCode;
public class Trapping_Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,2,0,3,2,5};
		int[] arr=preffixMax(nums);
		for(int i = 0; i<nums.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int suff[] = suffixMax(nums);
		for(int i = 0; i<nums.length; i++) {
			System.out.print(suff[i]+" ");
		}
		System.out.println(trap(nums));

	}
	 public  static int trap(int[] height) {
	      int[] left = preffixMax(height);  
	      int[] right = suffixMax(height);
	      int sum = 0;
	      for(int i=0; i<height.length; i++) {
	    	  sum+=(Math.min(left[i], right[i])-height[i])*1;
	      }
	      return sum;
	    }
	public static int[] preffixMax(int[] arr) {
		
		int[] prefix = new int[arr.length];
		int temp = arr[0];
		prefix[0]=arr[0];
		for(int i =1; i<arr.length; i++) {
			if(temp<arr[i]) {
				prefix[i]=arr[i];
				temp =arr[i];
				continue;
			}
			prefix[i] = temp;
		}
		return prefix;
	}
	public static int[] suffixMax(int[] arr) {
		int n = arr.length;
		int[] suffix = new int[n];
		suffix[n-1] = arr[n-1];
		for(int i = n-2; i>=0; i--) {
			if(suffix[i+1]<arr[i]) {
				suffix[i] = arr[i];
			}else {
				suffix[i] = suffix[i+1];
			}
		}
		return suffix;
	}

}
