package arrays.page.three;

import java.util.Arrays;

/**
 * 
 * http://www.geeksforgeeks.org/segregate-even-and-odd-numbers/ Segregate Even
 * and Odd numbers Given an array A[], write a function that segregates even and
 * odd numbers. The functions should put all even numbers first, and then odd
 * numbers.
 * 
 * @author amishash
 *
 */
public class EvenOddSegregator {

	private void solution(int argArr[]) {
		int oddIndex = 0;
		int evenIndex = argArr.length - 1;
		while (evenIndex >= oddIndex) {
			while (argArr[oddIndex] % 2 == 0)
				oddIndex++;
			while (argArr[evenIndex] % 2 != 0)
				evenIndex--;
			if(evenIndex<oddIndex)
				break;
			int temp = argArr[evenIndex];
			argArr[evenIndex] = argArr[oddIndex];
			argArr[oddIndex] = temp;
		}
		System.out.println(Arrays.toString(argArr));
	}

	public static void main(String[] args) {
		EvenOddSegregator evenOddSegregator = new EvenOddSegregator();
		evenOddSegregator.solution(new int[] { 12, 34, 45, 9, 8, 90, 3 });
	}
}
