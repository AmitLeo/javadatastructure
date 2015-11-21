package arrays.page.four;

import java.util.Arrays;

/**
 * 
 * http://www.geeksforgeeks.org/array-rotation/
 * 
 * Program for array rotation Write a function rotate(ar[], d, n) that rotates
 * arr[] of size n by d elements.
 * 
 * @author amishash
 */
public class ArrayRotation {

	private int getNextIndex(int argCurrentIndex, int rotationSize, int arrSize) {
		return (argCurrentIndex + rotationSize) % arrSize;
	}

	private int[] solution3(int argArr[], int size) {
		for (int i = 0; i < size; i++) {
			int temp = argArr[0];
			for (int j = 1; j < argArr.length; j++)
				argArr[j - 1] = argArr[j];
			argArr[argArr.length - 1] = temp;
		}
		return argArr;
	}

	private int[] solution2(int argArr[], int size) {
		int tempArr[] = new int[size];
		for (int i = 0; i < tempArr.length; i++)
			tempArr[i] = argArr[i];
		for (int j = size; j < argArr.length; j++)
			argArr[j - size] = argArr[j];
		for (int i = 0; i < tempArr.length; i++)
			argArr[argArr.length - i - 1] = tempArr[i];
		return argArr;
	}

	private int[] solution(int argArr[], int size) {
		int pivot = 0;
		int temp[] = new int[size];
		while (pivot < argArr.length) {
			if (temp[temp.length - 1] > 0) {
				for (int i = 0; i < temp.length; i++) {
					int nextIndex = getNextIndex(pivot, size, argArr.length);
					int tem = argArr[nextIndex];
					argArr[nextIndex] = temp[i];
					temp[i] = tem;
					pivot++;
				}
			} else {
				int nextIndex = getNextIndex(pivot, size, argArr.length);
				temp[pivot % size] = argArr[nextIndex];
				argArr[nextIndex] = argArr[pivot];
				pivot++;
			}
		}
		return argArr;
	}

	public static void main(String[] args) {
		ArrayRotation arrayRotation = new ArrayRotation();
		System.out.println(Arrays.toString(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
		System.out.println(Arrays.toString(arrayRotation.solution(new int[] {
				1, 2, 3, 4, 5, 6, 7 }, 2)));
		System.out.println("solution 2");

		System.out.println(Arrays.toString(arrayRotation.solution2(new int[] {
				1, 2, 3, 4, 5, 6, 7 }, 2)));
		System.out.println("solution 3");
		System.out.println(Arrays.toString(arrayRotation.solution3(new int[] {
				1, 2, 3, 4, 5, 6, 7 }, 2)));
	}

}
