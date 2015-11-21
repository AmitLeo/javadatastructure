package arrays.page.four;

/**
 * http://www.geeksforgeeks.org/maximum-difference-between-two-elements/
 * 
 * Maximum difference between two elements such that larger element appears after the smaller number
 * Given an array arr[] of integers,
 * find out the difference between any two elements such that larger element appears after the smaller number in arr[].

 * @author amishash
 *
 */
public class MaxDifferenceElements {

	private int solution(int argArr[])
	{
		int maxDiff=0;
		int smallestElem=argArr[0];
		for(int i =1;i<argArr.length;i++)
		{
			if(argArr[i]-smallestElem>maxDiff)
			{
				maxDiff=argArr[i]-smallestElem;
			}

			if(smallestElem>argArr[i])
				smallestElem=argArr[i];
		}
		return maxDiff;
	}
	
	public static void main(String[] args) {
		MaxDifferenceElements maxDifferenceElements=new MaxDifferenceElements();
		System.out.println(maxDifferenceElements.solution(new int[]{1, 2, 6, 80, 100}));

	}

}
