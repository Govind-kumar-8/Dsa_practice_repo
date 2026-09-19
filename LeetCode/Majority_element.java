package Dsa_practice.LeetCode;
import java.util.*;
public class Majority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,3};
		System.out.println(majorityElement2(arr));
		
	}
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

		    if (entry.getValue() > nums.length / 2) {
		        return entry.getKey();
		    }
		}
		return -1;
	 }
	public static int majorityElement2(int[] arr) {
		int el = arr[0];
		int count = 1;
		for(int i=1; i<arr.length; i++) {
			if(count ==0) {
				el = arr[i];
				count++;
				continue;
			}
			if(el ==arr[i]) {
			count++;
			}else {
				count--;
			}
		}
		return el;
	 }

}
