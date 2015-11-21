package arrays.page.three;

/**
 * 
 * http://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/
 * Given two sorted arrays, find their union and intersection. For example, if
 * the input arrays are: arr1[] = {1, 3, 4, 5, 7} arr2[] = {2, 3, 5, 6} Then
 * your program should print Union as {1, 2, 3, 4, 5, 6, 7} and Intersection as
 * {3, 5}.
 * 
 * @author amishash
 *
 */
public class UnionIntersection {

	private void solution(int argArr1[], int argArr2[]) {
		int index1 = 0;
		int index2 = 0;

		while (index1 < argArr1.length && index2 < argArr2.length) {
			if (argArr1[index1] == argArr2[index2]) {
				System.out.println("Intersection " + argArr1[index1]);
				index1++;
				index2++;
			} else if (argArr1[index1] <= argArr2[index2]) {
				System.out.println("Union " + argArr1[index1]);
				index1++;
			} else {
				System.out.println("Union " + argArr1[index1]);
				index2++;
			}

			if (index2 >= argArr2.length) {
				while (index1 < argArr1.length) {
					System.out.println("Union " + argArr1[index1]);
					index1++;
				}
			}
			if (index1 >= argArr1.length) {
				while (index2 < argArr2.length) {
					System.out.println("Union " + argArr1[index1]);
					index1++;
				}
			}
		}
	}

	public static void main(String[] args) {
		UnionIntersection unionIntersection = new UnionIntersection();
		unionIntersection.solution(new int[] { 1, 2, 3, 4, 5, 6, 7 },
				new int[] { 3, 5 });
	}

}
