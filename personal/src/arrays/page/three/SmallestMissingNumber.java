package arrays.page.three;

/**
 * 
 * http://www.geeksforgeeks.org/find-the-first-missing-number/
 * 
 * Given a sorted array of n integers where each integer is in the range from 0
 * to m-1 and m > n. Find the smallest number that is missing from the array.
 * Examples Input: {0, 1, 2, 6, 9}, n = 5, m = 10 Output: 3 Input: {4, 5, 10,
 * 11}, n = 4, m = 12 Output: 0 Input: {0, 1, 2, 3}, n = 4, m = 5 Output: 4
 * Input: {0, 1, 2, 3, 4, 5, 6, 7, 10}, n = 9, m = 11 Output: 8
 * 
 * @author amishash
 *
 */
public class SmallestMissingNumber {

	private int solution(int argArr[]) {
		for (int i = 0; i < argArr.length-1; i++) {
			if (argArr[0] != 0)
				return 0;
			else if(argArr[i+1]-argArr[i]!=1)
				return argArr[i]+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		SmallestMissingNumber smallestMissingNumber = new SmallestMissingNumber();
		System.out.println(smallestMissingNumber.solution(new int[] { 0, 1, 2, 6, 9 }));
	}
}
