import java.util.HashSet;

/**
 * Given an array, find a pair (a,b) such that a+b = x
 * @author reshma
 *
 */
public class FindPairs {
	/*
	 * naive approach: nC2 = n(n-1) / 2 = O(n2)
	 * 
	 * hash approach:
	 * insert into hash table - O(n)
	 * search for the pair in hash table which forms the sum  - n *1 = O(n)
	 * 
	 * so total time complexity is O(n)
	 * 
	 * space complexity: O(k) where k is range of integers
	 * 
	 * Note: size of the hash table should be the maximum element in the array.
	 * suppose max element in the array is 100, then the size of hash table should be 100.
	 * */
	public static void findPairs(int[] arr, int sum) {
		int temp;
		int[] hash = new int[10];
		for(int i=0;i<arr.length;i++) {
			temp = sum - arr[i];
			if(temp>=0 && hash[temp] == 1)
				System.out.println( "for sum: "+ sum + ", pair is: (" + arr[i] + "," + temp + ")");
			hash[arr[i]] = 1;
		}
	}
	
	private static boolean isPairExist(int[] arr, int sum) {
        HashSet<Integer> integers = new HashSet<>();
        for (int input : arr) {
            if (integers.contains(sum - input)) {
                return true;
            }
            integers.add(input);
        }
        return false;
    }
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,3,4,5,6,8,9};
		int sum = 10;
		findPairs(arr, sum);
		
		if(isPairExist(arr, sum)) {
            System.out.println("\nThe pairs of elements whose sum is: " + sum + " found in an array");
        }
        else {
            System.out.println("The pairs of elements whose sum is: " + sum + " not found in an array");
}
	}
}
