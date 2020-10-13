/**
 * Given a sorted array of size n, find an element that occurs more than n/2 times
 * times
 * 
 * @author reshma
 *
 */
public class MajorityElement {
	/*
	 * Moore's voting algorithm
	 * Time complexity:O(n)
	 * Space complexity:O(1)
	 */
	public static int getMajorityElement(int[] arr, int size) {
		int majorIndex = 0, count = 1;
		for (int index = 1; index < size; index++) {
			if (arr[majorIndex] == arr[index])
				count++;
			else
				count--;
			if (count == 0) {
				majorIndex = index;
				count = 1;
			}
		}
		return arr[majorIndex];
	}

	public static boolean isMajorityElement(int[] arr, int size, int majorityElement) {
		int count = 0;
		for (int index = 0; index < size; index++) {
			if (arr[index] == majorityElement)
				count++;
		}
		return (count > size / 2);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,3,1,1,6,1,9};
		int element = getMajorityElement(arr, 7);
		boolean flag = isMajorityElement(arr, 7, element);
		if(flag)
			System.out.println("Majority element is: " + element);
		else
			System.out.println("There is no majority element");
	}
}
