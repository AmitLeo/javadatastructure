package arrays.page.four;

/**
 * http://www.geeksforgeeks.org/leaders-in-an-array/ Leaders in an array Write a
 * program to print all the LEADERS in the array. An element is leader if it is
 * greater than all the elements to its right side. And the rightmost element is
 * always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are
 * 17, 5 and 2.
 * 
 * @author amishash
 *
 */
public class ArrayLeaders {

	public void solution(int argArr[]) {
		int maxElement = argArr[argArr.length - 1];
		System.out.println(maxElement);
		for (int i = argArr.length - 2; i >= 0; i--) {
			if (argArr[i] > maxElement) {
				System.out.println(argArr[i]);
				maxElement = argArr[i];
			}
		}
	}

	public static void main(String[] args) {

		ArrayLeaders arrayLeaders = new ArrayLeaders();
		arrayLeaders.solution(new int[] { 16, 17, 4, 3, 5, 2 });
	}

}
