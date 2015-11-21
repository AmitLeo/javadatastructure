package arrays.page.three;

import java.util.Arrays;

/**
 * 
 * http://www.geeksforgeeks.org/find-subarray-with-given-sum/
 * 
 * Find subarray with given sum Given an unsorted array of nonnegative integers,
 * find a continous subarray which adds to a given number.
 * 
 * @author amishash
 *
 */
public class SubArraySum {

	private void solution(int argArr[], int sum) {
		int currSum = 0;
		int startingIndex = 0;
		for (int i = 0; i < argArr.length; i++) {
			currSum = currSum + argArr[i];
			while (currSum > sum) {
				currSum = currSum - argArr[startingIndex];
				startingIndex++;
			}
			if (sum == currSum)
				System.out.println(Arrays.toString(Arrays.copyOfRange(argArr,
						startingIndex, i + 1)));
		}
	}

	public static void main(String[] args) {
		SubArraySum subArraySum = new SubArraySum();
		subArraySum.solution(new int[] { 1, 4, 20, 3, 10, 5 }, 33);

	}

}
