package arrays.page.three;

/**
 * 
 * http://www.geeksforgeeks.org/check-if-array-elements-are-consecutive/ Given
 * an unsorted array of numbers, write a function that returns true if array
 * consists of consecutive numbers. Examples: a) If array is {5, 2, 3, 1, 4},
 * then the function should return true because the array has consecutive
 * numbers from 1 to 5. b) If array is {83, 78, 80, 81, 79, 82}, then the
 * function should return true because the array has consecutive numbers from 78
 * to 83. c) If the array is {34, 23, 52, 12, 3 }, then the function should
 * return false because the elements are not consecutive. d) If the array is {7,
 * 6, 5, 5, 3, 4}, then the function should return false because 5 and 5 are not
 * consecutive.
 * 
 * @author amishash
 *
 */
public class ConsequitiveElements {

	private boolean solution(int argArr[]) {
		int smallestNumber = argArr[0];
		int largetNumber = argArr[argArr.length - 1];
		for (int i = 0; i < argArr.length; i++) {

			if (smallestNumber > argArr[i])
				smallestNumber = argArr[i];
			else if (largetNumber < argArr[i])
				largetNumber = argArr[i];
		}
		if (largetNumber - smallestNumber == argArr.length - 1)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		ConsequitiveElements consequitiveElements = new ConsequitiveElements();
		System.out.println(consequitiveElements.solution(new int[] { 5, 2, 3,
				1, 4 }));
		System.out.println(consequitiveElements.solution(new int[] { 5, 6, 3,
				1, 4 }));

	}

}
