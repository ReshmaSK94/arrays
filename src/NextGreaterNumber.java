/**
 * Find the next greateer number with the same set of digits.
 * Given a number n, 
 * find the smallest number that has same set of digits as n and is greater than n
 * @author reshma
 *
 */
public class NextGreaterNumber {
	/**
	 * 
	 * @param number
	 * @param n - number of digits in the number
	 */
	
	/*
	 * Time Complexity: O(n)
	 * */
	public static void findNext(char[] number, int n) {
		int i,j;
		for (i = n - 1; i > 0; i--) {
			if (number[i] > number[i - 1])
				break;
		}
		if (i == 0) {
			System.out.println("Next number not possible");
			return;
		}
		
		int x= number[i-1], smallest=i;
		
		for(j=i+1;j<n;j++) {
			if(number[j] > x && number[j] < number[smallest])
				smallest = j;
		}
		
		//swap(number[smallest], number[i-1]);
		char temp = number[smallest];
		number[smallest] = number[i-1];
		number[i-1] = temp;
		
		//sort(number+i, number+n) or reverse
		reverse(number,i,n-1);
		System.out.println("Next number with same set of digits is: ");
		for(char a: number) {
			System.out.println(a);
		}
	}
	
	private static void reverse(char[] arr, int leftIndex, int rightIndex) {
		char temp;
		for (; leftIndex < rightIndex; leftIndex++, rightIndex--) {
			temp = arr[leftIndex];
			arr[leftIndex] = arr[rightIndex];
			arr[rightIndex] = temp;
		}
	}
	
	public static void main(String[] args) {
		char[] arr = {'2','5','6','7','8'};
		findNext(arr, 5);
	}
}
