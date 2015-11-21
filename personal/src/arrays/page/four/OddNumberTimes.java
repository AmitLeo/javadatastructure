package arrays.page.four;

/**
 * Find the Number Occurring Odd Number of Times
 * 
 * Given an array of positive integers. All numbers occur even number of times
 * except one number which occurs odd number of times. Find the number in O(n)
 * time & constant space.
 * 
 * @author amishash
 *
 */

public class OddNumberTimes {

	public void solution(int argArr[]) {
		int xorRes = argArr[0];
		for (int i = 1; i < argArr.length; i++)
			xorRes = xorRes ^ argArr[i];
		System.out.println(xorRes);
	}

	public static void main(String[] args) {
		OddNumberTimes oddNumberTimes=new OddNumberTimes();
		oddNumberTimes.solution(new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2});
	}

}
