package arrays;

import java.util.Arrays;

/**
 * 
 * Fill two instances of all numbers from 1 to n in a specific way Given a
 * number n, create an array of size 2n such that the array contains 2 instances
 * of every number from 1 to n, and the number of elements between two instances
 * of a number i is equal to i. If such a configuration is not possible, then
 * print the same.
 * 
 * @author amishash
 *
 */

public class FillTwoInstances {

	int arr[];
	int size = 0;
	boolean flag = true;

	public void solution(int argNumber) {
		size = 2 * argNumber;
		arr = new int[size];
		recurse(argNumber);

	}

	public void recurse(int argInt) {
		int i = 0;
		if (argInt == 0) {
			this.flag = false;
			return;
		}
		while (argInt + i + 1 < arr.length) {
			if (arr[i] == 0 && arr[i + argInt + 1] == 0) {
				arr[i] = argInt;
				arr[argInt + i + 1] = argInt;
				int temp = argInt;
				recurse(--temp);
				if (flag) {
					arr[i] = 0;
					arr[argInt + i + 1] = 0;
				}
			}
			i++;
		}
	}

	public static void main(String[] args) {
		FillTwoInstances fillTwoInstances = new FillTwoInstances();
		fillTwoInstances.solution(4);
		System.out.println(Arrays.toString(fillTwoInstances.arr));

	}

}
