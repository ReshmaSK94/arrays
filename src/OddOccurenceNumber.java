import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Find the number occurring odd number of times in an array, given that exactly
 * one number occurs odd number of times
 * 
 * @author reshma
 *
 */
public class OddOccurenceNumber {
	/* bitwise XOR approach
	 * Time complexity: O(n) 
	 * Space complexity: O(1)
	 */
	public static int getOddOccurenceNumber(int[] arr, int size) {
		int result = 0;
		for (int index = 0; index < size; index++) {
			result = result ^ arr[index];
		}
		return result;
	}
	
	/*
	 * Hash approach
	 * Time complexity: O(n) 
	 * Space complexity: O(n)
	 * */
	public static int getOddOccurence(int[] arr, int size) {
		Map<Integer, Integer> map = new HashMap<>();
		int result = 0;
		Integer count = 0;
		for (int index = 0; index < size; index++) {
			 count = map.get(arr[index]);
			if(count!=null) {
				map.put(arr[index], count.intValue() +1);			
			}else {
				map.put(arr[index], 0);
			}
		}
		for(Entry<Integer, Integer> e: map.entrySet())
		{
			if(e.getValue() % 2 !=0)
				result = e.getKey();
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 9, 1, 1, 6, 6, 9 };
		int[] arr2 = new int[] { 4, 0, 0, 4, 9, 9, 0 };
		System.out.println("Odd occurence number in arr1 is: " + getOddOccurenceNumber(arr1, 7));
		System.out.println("Odd occurence number in arr2 is: " + getOddOccurenceNumber(arr2, 7));
		
		System.out.println("Hash Approach -> Odd occurence number in arr1 is: " + getOddOccurenceNumber(arr1, 7));
		System.out.println("Hash Approach -> Odd occurence number in arr2 is: " + getOddOccurenceNumber(arr2, 7));
	}
}
