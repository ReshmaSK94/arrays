/**
 * find maximum difference between two elements in an array such that, bigger
 * element appears after the smaller element
 * 
 * @author reshma
 *
 */
public class MaximumDifference {

	/*
	 * Function assumes that there are atleast 2 elements in an array. The function
	 * returns negative value if the array is sorted in descending order. Returns 0
	 * if all elements are equal.
	 */
	
	/*
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 * */
	public static int getMaxDifference(int[] arr, int size) {
		int min_ele_so_far = arr[0];
		int maxdiff_so_far = arr[1] - arr[0];
		int curr_diff = arr[1] - arr[0];

		for (int index = 1; index < size; index++) {
			if (arr[index] < min_ele_so_far) {
				min_ele_so_far = arr[index];
			} else {
				curr_diff = arr[index] - min_ele_so_far;
				if (curr_diff > maxdiff_so_far)
					maxdiff_so_far = curr_diff;
			}

		}
		return maxdiff_so_far;
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,3,1,1,6,1,9};	
		int[] arr2 = new int[] {4,3,10,2,9,1,6};	
		System.out.println("Maximum difference in arr1 is: " + getMaxDifference(arr1,7));	
		System.out.println("Maximum difference in arr2 is: " + getMaxDifference(arr2,7));		
	}
}
