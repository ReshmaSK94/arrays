import java.util.HashMap;

/**
 * Consider an array A which contains only 0's and 1's, find the largest subarray with equal no. of 1's and 0's.
 * @author reshma
 *
 */
public class LargestSubArray {

	/*
	 * public static void largestSubArray(int[] arr, int arr_size) { int
	 * max_size=-1, startIndex=0,index; Integer min=0, max=0; int[] sumUpto = new
	 * int[arr_size]; sumUpto[0] = (arr[0] == 0) ? -1:1; min = max= sumUpto[0];
	 * findminmax(arr,sumUpto, max, min,arr_size);
	 * 
	 * 
	 * int hash_size = max-min+1, sumSoFar = 0; int[] hash = new int[hash_size];
	 * 
	 * for(index=0;index < hash_size;index++) { hash[index] = -1; }
	 * 
	 * for(index=0;index < arr_size;index++) { if(sumUpto[0] == 0) { max_size =
	 * index +1; startIndex=0; continue; } sumSoFar = sumUpto[index] - min;
	 * if(hash[sumSoFar] == -1) hash[sumSoFar] = index; else {
	 * if(index-hash[sumSoFar] > max_size) { max_size = index-hash[sumSoFar];
	 * startIndex = hash[sumSoFar] + 1; } } } System.out.println("Max size is :" +
	 * max_size); if(max_size == -1) System.out.println("No such subArray"); else
	 * System.out.println("Largest sub array is from "+ startIndex + "and"+
	 * (startIndex + max_size-1)); }
	 * 
	 * private static void findminmax(int[] arr, int[] sumUpto, Integer max, Integer
	 * min, int arr_size) { for(int index=1;index<arr_size;index++) { sumUpto[index]
	 * = sumUpto[index-1] + ((arr[index] == 0) ? -1:1); if(sumUpto[index] < min) {
	 * min = sumUpto[index]; } if(sumUpto[index] > max) { max = sumUpto[index]; } }
	 * }
	 */
	
	public static void main(String[] args) {
		int[] arr1 = {1,0,1,0,0,1};
		int[] arr2 = {1,0,1,0,1,1};
		int[] arr3 = {1,1,1,0,1,1};
		int[] arr4 = {1,1,1,1,1,1};
		System.out.println("Max size is :"+ findSubArray(arr1, arr1.length));
		System.out.println("Max size is :" + findSubArray(arr2, arr2.length));
		System.out.println("Max size is :" + findSubArray(arr3, arr3.length));
		System.out.println("Max size is :" + findSubArray(arr4, arr4.length));
		
		System.out.println("Max size is :" + maxLen(arr1, arr1.length));
	}
	
	/*
	 * Time complexity: O(n2)
	 * Space complexity: O(1)
	 * */
  
	
	public static int findSubArray(int arr[], int n) 
    { 
        int sum = 0; 
        int maxsize = -1, startindex = 0; 
        int endindex = 0; 
  
        // Pick a starting point as i 
  
        for (int i = 0; i < n - 1; i++) { 
            sum = (arr[i] == 0) ? -1 : 1; 
  
            // Consider all subarrays starting from i 
  
            for (int j = i + 1; j < n; j++) { 
                if (arr[j] == 0) 
                    sum += -1; 
                else
                    sum += 1; 
  
                // If this is a 0 sum subarray, then 
                // compare it with maximum size subarray 
                // calculated so far 
  
                if (sum == 0 && maxsize < j - i + 1) { 
                    maxsize = j - i + 1; 
                    startindex = i; 
                } 
            } 
        } 
        endindex = startindex + maxsize - 1; 
        if (maxsize == -1) 
            System.out.println("No such subarray"); 
        else
            System.out.println(startindex + " to " + endindex); 
  
        return maxsize; 
    } 
	
	// Returns largest subarray with 
    // equal number of 0s and 1s 
	/*
	 * Time complexity: O(n)
	 * Space complexity: O(n)
	 * */
  
	public static int maxLen(int arr[], int n) 
	{
		// Creates an empty hashMap hM

		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		// Initialize sum of elements
		int sum = 0;

		// Initialize result
		int max_len = 0;
		int ending_index = -1;
		int start_index = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i] == 0) ? -1 : 1;
		}

		// Traverse through the given array

		for (int i = 0; i < n; i++) {
			// Add current element to sum

			sum += arr[i];

			// To handle sum=0 at last index

			if (sum == 0) {
				max_len = i + 1;
				ending_index = i;
			}

			// If this sum is seen before,
			// then update max_len if required
			if (hM.containsKey(sum + n)) {
				if (max_len < i - hM.get(sum + n)) {
					max_len = i - hM.get(sum + n);
					ending_index = i;
				}
			} else // Else put this sum in hash table
				hM.put(sum + n, i);
		}

		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i] == -1) ? 0 : 1;
		}

		start_index = ending_index - max_len + 1;
		System.out.println(start_index + " to " + ending_index);

		return max_len;
	}
}
