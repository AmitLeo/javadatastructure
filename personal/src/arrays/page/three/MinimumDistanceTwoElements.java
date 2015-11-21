package arrays.page.three;

/**
 * http://www.geeksforgeeks.org/find-the-minimum-distance-between-two-numbers/
 * Given an unsorted array arr[] and two numbers x and y, find the minimum
 * distance between x and y in arr[]. The array might also contain duplicates.
 * You may assume that both x and y are different and present in arr[].
 * Examples: Input: arr[] = {1, 2}, x = 1, y = 2 Output: Minimum distance
 * between 1 and 2 is 1. Input: arr[] = {3, 4, 5}, x = 3, y = 5 Output: Minimum
 * distance between 3 and 5 is 2. Input: arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4,
 * 8, 3}, x = 3, y = 6 Output: Minimum distance between 3 and 6 is 4. Input:
 * arr[] = {2, 5, 3, 5, 4, 4, 2, 3}, x = 3, y = 2 Output: Minimum distance
 * between 3 and 2 is 1.
 * 
 * @author amishash
 *
 */

public class MinimumDistanceTwoElements {

	private int solution(int argArr[], int argIndex1, int argIndex2) {
		int distance = argArr.length;
		int latestElement = 0;
		double prevIndex = Double.NaN;

		for (int i = 0; i < argArr.length; i++) {
			if (argArr[i] == argIndex1 || argIndex2 == argArr[i]) {
				if (prevIndex == Double.NaN) {
					latestElement = argArr[i];
					prevIndex = i;
				} else {
					if (latestElement != argArr[i] && latestElement != 0) {
						distance = Math.min(distance,
								Math.abs((int) prevIndex - i));
					}
					latestElement = argArr[i];
					prevIndex = i;
				}
			}
		}
		return distance;
	}

	public static void main(String[] args) {
		MinimumDistanceTwoElements minimumDistanceTwoElements = new MinimumDistanceTwoElements();
		System.out.println(minimumDistanceTwoElements.solution(new int[] { 3,
				4, 5 }, 3, 5));
		System.out.println(minimumDistanceTwoElements.solution(new int[] { 3,
				4, 1, 6, 6, 7, 5 }, 3, 5));

	}

}
