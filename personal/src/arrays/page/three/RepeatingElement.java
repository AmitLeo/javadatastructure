package arrays.page.three;

/**
 * http://www.geeksforgeeks.org/find-the-two-repeating-elements-in-a-given-array
 * /
 * 
 * You are given an array of n+2 elements. All elements of the array are in
 * range 1 to n. And all elements occur once except two numbers which occur
 * twice. Find the two repeating numbers.
 * 
 * For example, array = {4, 2, 4, 5, 2, 3, 1} and n = 5
 * 
 * The above array has n + 2 = 7 elements with all elements occurring once
 * except 2 and 4 which occur twice. So the output should be 4 2.
 * 
 * 
 * http://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/
 * 
 * Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing any number of times. 
 * 
 * Find these repeating numbers in O(n) and using only constant memory space.
 * For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should be 1, 3 and 6.
 * This problem is an extended version of following problem.
 * 
 * @author amishash
 *
 */

public class RepeatingElement {

	private void solution(int argArr[]) {
		for (int i = 0; i < argArr.length; i++) {
			int actualNumber = argArr[i];
			if (argArr[Math.abs(actualNumber)] > 0) {
				argArr[Math.abs(actualNumber)] = -argArr[Math.abs(actualNumber)];
			} else
				System.out.println(Math.abs(argArr[Math.abs(actualNumber)]));
		}
	}

	public static void main(String[] args) {
		RepeatingElement repeatingElement = new RepeatingElement();
		repeatingElement.solution(new int[] { 4, 2, 4, 5, 2, 3, 1 });
	}

}
