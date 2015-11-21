package arrays.page.three;

/**
 * 
 * http://www.geeksforgeeks.org/equilibrium-index-of-an-array/ Equilibrium index
 * of an array is an index such that the sum of elements at lower indexes is
 * equal to the sum of elements at higher indexes. For example, in an arrya
 * A:A[0] = -7, A[1] = 1, A[2] = 5, A[3] = 2, A[4] = -4, A[5] = 3, A[6]=0 3 is
 * an equilibrium index, because:A[0] + A[1] + A[2] = A[4] + A[5] + A[6] 6 is
 * also an equilibrium index, because sum of zero elements is zero, i.e., A[0] +
 * A[1] + A[2] + A[3] + A[4] + A[5]=0 7 is not an equilibrium index, because it
 * is not a valid index of array A. Write a function int equilibrium(int[] arr,
 * int n); that given a sequence arr[] of size n, returns an equilibrium index
 * (if any) or -1 if no equilibrium indexes exist.
 * 
 * @author amishash
 *
 */

public class EquillibriumIndex {

	private void solution(int argArr[]) {
		int sum = 0; // initialize sum of whole array
		int leftsum = 0; // initialize leftsum
		int i;
		for (i = 0; i < argArr.length; ++i)
			sum += argArr[i];
		System.out.println(sum);
		for (i = 0; i < argArr.length; ++i) {
			sum -= argArr[i]; // sum is now right sum for index i
			if (leftsum == sum)
				System.out.println(i);
			leftsum += argArr[i];
		}
	}

	public static void main(String[] args) {
		EquillibriumIndex equillibriumIndex = new EquillibriumIndex();
		equillibriumIndex.solution(new int[] { -7, 1, 5, 2, -4, 3, 0 });

	}

}
