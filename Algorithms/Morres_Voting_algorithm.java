package Dsa_practice.Algorithms;

public class Morres_Voting_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this algorith works on majority element 
		//in which we find element occurs more than n/2 lenght
		//this algorith work on two variable by using voting concept 
		//by dividing the small size of data
		//if mojority element is present in array
		//then give the majority element if not guarantee to they have 
		//majority element in array it will not work
		int [] arr = {2,2,1,1,1,2,2};
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
		System.out.println(el);
	}

}
