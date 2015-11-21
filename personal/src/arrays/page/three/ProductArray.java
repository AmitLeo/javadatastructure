package arrays.page.three;

import java.util.Arrays;

/**
 * http://www.geeksforgeeks.org/a-product-array-puzzle/
 * 
 * Given an array arr[] of n integers, construct a Product Array prod[] (of same
 * size) such that prod[i] is equal to the product of all the elements of arr[]
 * except arr[i]. Solve it without division operator and in O(n).
 * 
 * @author amishash
 *
 */

public class ProductArray {

	private void solution(int argArr[]) {
		int leftArr[] = new int[argArr.length];
		int rightArr[] = new int[argArr.length];

		leftArr[0] = 1;
		rightArr[argArr.length - 1] = 1;
		for (int i = 2; i <= leftArr.length; i++)
			leftArr[i - 1] = leftArr[i - 2] * argArr[i - 2];
		System.out.println(Arrays.toString(leftArr));
		for (int i = rightArr.length - 2; i >= 0; i--)
			rightArr[i] = argArr[i + 1] * rightArr[i + 1];
		System.out.println(Arrays.toString(rightArr));

		for (int i = 0; i < rightArr.length; i++)
			rightArr[i] = leftArr[i] * rightArr[i];

		System.out.println(Arrays.toString(rightArr));
	}

	public static void main(String[] args) {
		ProductArray productArray = new ProductArray();
		productArray.solution(new int[] { 10, 3, 5, 6, 2 });

	}

}
