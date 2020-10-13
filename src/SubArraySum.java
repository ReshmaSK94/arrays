/**
 * Given an unsorted array, find the sub array which sums to given value X
 * @author reshma
 *
 */
public class SubArraySum {

	/*
	 * Naive approach:
	 * Find all the possible sub arrays and find it sum
	 * Time Complexity: O(n2)
	 * 
	 * approach-2:
	 * Move the left and right pointers and 
	 * find the sub array by checking the sum after every move
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 * but this approach fails when the array contains negative numbers
	 * 
	 * we can use hashing approach if the array contains negative numbers.
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 * */
	
	/*
	 * this method implements approach-2
	 * */
	public static int subArray(int[] arr, int size, int sum) {
		int curSum = arr[0], start = 0, index;

		for (index = 1; index <= size; index++) {
			while (curSum > sum && start < index - 1) {
				curSum = curSum - arr[start];
				start++;
			}
			if (curSum == sum) {
				System.out.println("Sum found between indexes: " + start + " and " + (index-1));
				return 1;
			}
			if (index < size)
				curSum = curSum + arr[index];
		}
		System.out.println("Subarray not found for the given sum:" + sum);

		return 0;
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 5, 8, 2, 1, 3, 7};
		subArray(arr, 7, 16);
		subArray(arr, 7, 10);
	}
}
