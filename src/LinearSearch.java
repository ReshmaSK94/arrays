/**
 * Linear search or Sequential search. this is applicable for sorted/unsorted arrays and linked list
 * @author reshma
 *
 */
public class LinearSearch {
	
	/*
	 * Time complexity
	 * approach 1:
	 *  best case: no of iterations = 1
	 *  worst case: no of iterations = n+1
	 *  avg case: no of iterations = (n+2)/2 = O(n)
	 *  
	 * approach 2:
	 * Recurrence relation
	 *  T(n) = T(n-1) + 1; if n > 1
	 *  --> it means after 1 comparison, size of elements to be compared will be reduced by 1, i.e;  n = n-1
	 *  T(n) = 1; if n = 1
	 *  So, T(n) = O(n)
	 */
	
	public static int linearSearch(int[] arr, int target) {
		for(int i=0;i<arr.length; i++) {
			if(arr[i] == target)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,3,4,5,6,8,9};
		System.out.println( "Found target 5 at:" + linearSearch(arr, 5));
	}
}
