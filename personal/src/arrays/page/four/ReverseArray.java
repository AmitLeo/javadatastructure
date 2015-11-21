package arrays.page.four;

import java.util.Arrays;

/**
 * http://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 * Write a program to reverse an array or string
 * 
 * @author amishash
 *
 */
public class ReverseArray {

	private int[] solution(int argArr[])
	{
		for(int i=0;i<argArr.length/2;i++)
		{
			int temp=argArr[i];
			argArr[i]=argArr[(argArr.length-1)-i];
			argArr[(argArr.length-1)-i]=temp;
		}
		return argArr;
	}
	
	public static void main(String[] args) {
		ReverseArray reverseArray=new ReverseArray();
		System.out.println(Arrays.toString(reverseArray.solution(new int[]{1, 2, 3, 4, 5, 6})));
	}

}
