/**
 * Given an array of positive numbers, 
 * find the smallest number that can not be formed with the sum of numbers from array
 * @author reshma
 *
 */
public class SmallestNotPossible {

	/*
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 * */
	public static int findSmallestNotPossible(int[] arr, int size) {
		int p = 1;
		// sort the array in ascending order which will take O(nlogn) time

		// below steps will take O(n) time
		for (int i = 0; i < size; i++) {
			if (arr[i] > p)
				return p;
			else
				p = arr[i] + p;
		}
		return p;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,11,100};		
		System.out.println(findSmallestNotPossible(arr, arr.length));
	}
}
