package arrays.page.four;

import static java.lang.Double.NaN;

import java.util.Arrays;
/**
 * 
 * Merge an array of size n into another array of size m+n
 * There are two sorted arrays. First one is of size m+n containing only m elements. 
 * Another one is of size n and contains n elements. 
 * Merge these two arrays into the first array of size m+n such that the output is sorted.
 * 
 * @author amishash
 *
 */
public class MergeArrays {

	private double[] solution(double argArr1[],double argArr2[])
	{
		int j=argArr2.length-1;
		for(int i=argArr1.length;i>0;i--)
		{
			if(argArr1[i]==NaN)
			{
				argArr1[i]=argArr2[j];
				j--;
			}
		}
		return argArr1;
	}
	
	
	public static void main(String[] args) {
		
		MergeArrays mergeArrays=new MergeArrays();
		double sortedArr1[] = {2, 8, NaN, NaN, NaN, 13, NaN, 15, 20};
		double sortedArr2[] = {5, 7, 9, 25};	
		System.out.println(Arrays.toString( mergeArrays.solution(sortedArr1, sortedArr2)));
	}
}
