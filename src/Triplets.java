/**
 * Find a triplet that sums to a given value
 * 
 * @author reshma
 *
 */
public class Triplets {

	/* For naive approach, time complexity will be O(n3) which involves 3 for loops.
	 * 2nd approach: Fix 2 elements and do binary search for the 3rd element. TC: O(n2logn).
	 * 
	 * Best approach: fix 1st element, and work on left and right pointers for other 2 elements
	 * Time complexity: O(n2)
	 * Space complexity: O(1)
	 */
	public static boolean findTriplet(int[] arr, int size, int sum) {
		int left, right, tripletSum = 0;
		// sort the array -> O(nlogn)

		// the below steps will take O(n2)
		for (int index = 0; index < size - 2; index++) {
			left = index + 1;
			right = size - 1;
			while (left < right) {
				tripletSum = arr[index] + arr[left] + arr[right];

				if (tripletSum == sum) {
					System.out.println("Triplet for given sum:" + sum + " is: (" + arr[index] + "," + arr[left] + ","
							+ arr[right] + ")");
					return true;
				}
				if (tripletSum < sum)
					left++;
				else
					right--;
			}
		}
		return false;
	}

	public static void findingTriplets(int[] arr, int size, int sum) {
		if (!findTriplet(arr, size, sum))
			System.out.println("Triplet not found for given array");
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 0, 3, 5, 7, 9, 44 };
		findingTriplets(arr1, 6, 19);
		findingTriplets(arr1, 6, 25);
	}
}
