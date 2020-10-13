/**
 * Given an array and an integer k, find maximum element for each and every
 * contiguous sub array of size k
 * 
 * @author reshma
 *
 */
public class ContiguousSubArray {
	/*
	 * Time Complexity: O(nk)
	 * Space Complexity: O(1)
	 * 
	 * If we use binary search tree for each of sub arrays, then the 
	 * Time Complexity: O(nlogk)
	 * Space Complexity: O(k)
	 * */
	public static void Maximumelement(int arr[], int n, int k) {
		int j, max, i;
		System.out.println("maximum for each and every contiguous subarray of size " + k + ", is: ");
		for (i = 0; i <= n - k; i++) {
			max = arr[i];
			for (j = 1; j < k; j++) {
				if (arr[i + j] > max)
					max = arr[i + j];
			}
			System.out.println(max);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[] { 0, 3, 5, 7, 9, 44 };
		Maximumelement(arr1,6,3);
		Maximumelement(arr1,6,4);
		}
}
