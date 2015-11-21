package arrays.page.four;

import java.util.HashSet;
import java.util.Set;

/**
 * http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-
 * numbers
 * -and-another-number-x-determines-whether-or-not-there-exist-two-elements
 * -in-s-whose-sum-is-exactly-x/
 * 
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 * 
 * @author amishash
 *
 */
public class CheckPairSum {

	private boolean solution(int argArr[], int argSum) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < argArr.length; i++) {
			if (set.contains(argSum - argArr[i]))
				return true;
			else
				set.add(argArr[i]);
		}
		return false;
	}

	public static void main(String[] args) {

		CheckPairSum checkPairSum = new CheckPairSum();
		System.out.println(checkPairSum.solution(
				new int[] { 1, 2, 4, 5, 7, 8 }, 5));
		System.out.println(checkPairSum.solution(
				new int[] { 1, 2, 4, 5, 7, 8 }, 110));
	}

}
