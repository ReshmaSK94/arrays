/**
 * Find the equilibrium index in a given array. i.e; sum of all elements from
 * index 0 to equilibrium index will be equal to the sum of remaining elements
 * 
 * @author reshma
 *
 */

public class EquilibriumIndex {

	/*
	 * Time complexity: O(n)
	 * Space complexity: O(1)
	 */
	public static void findEquilibriumIndex(int[] arr, int size) {
		int leftSum = 0, sum = 0;

		// find the total sum of the array
		for (int index = 0; index < size; index++) {
			sum += arr[index];
		}

		for (int index = 0; index < size; index++) {
			sum -= arr[index];
			leftSum += arr[index];
			if (leftSum == sum) {
				System.out.println("Equlibrium index is: " + (index));
			}

		}
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 10, 5, 15, 3, 4, 21, 2 };
		int[] arr2 = new int[] { 0, 3, 5, 7, 9, 44 };
		int[] arr3 = new int[] { 7, 2, 1, 4, 6, 0, 0 };
		findEquilibriumIndex(arr1, 7);

		findEquilibriumIndex(arr2, 6);
		findEquilibriumIndex(arr3, 7);
	}
}
