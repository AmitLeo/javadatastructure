package arrays.page.four;

import java.util.Arrays;

/**
 * 
 * http://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
 * 
 * Segregate 0s and 1s in an array
 * 
 * You are given an array of 0s and 1s in random order.
 * Segregate 0s on left side and 1s on right side of the array. Traverse array only once.

 * @author amishash
 *
 */
public class Segregator {

	
	private int[] solution(int argArr[])
	{
		int zeroCounter=0;
		for(int i =0;i<argArr.length;i++)
			if(argArr[i]==0)
				zeroCounter++;
		for(int i=0;i<argArr.length;i++)
		{
			if(i<zeroCounter)
				argArr[i]=0;
			else
				argArr[i]=1;
		}
		return argArr;
	}
	
	
	private int getNextZeroCounter(int zeroCounter,int [] argArr)
	{
		while(zeroCounter<argArr.length){
			if(argArr[zeroCounter]==1){
				return zeroCounter;
			}
			zeroCounter++;
		}
		return zeroCounter;
	}

	private int getNextOneCounter(int oneCounter,int [] argArr)
	{
		while( oneCounter>0){
			if(argArr[oneCounter]==0){
				return oneCounter;
			}
			oneCounter--;
		}
		return oneCounter;
	}
	

	private int[] solution2(int argArr[])
	{
		int zeroCounter=getNextZeroCounter(0,argArr);;
		int oneCounter=getNextOneCounter(argArr.length-1,argArr);
		while(oneCounter>=0 && zeroCounter<=argArr.length)
		{
			argArr[zeroCounter]=1;
			argArr[oneCounter]=0;
			zeroCounter=getNextZeroCounter(zeroCounter,argArr);
			oneCounter=	getNextOneCounter(oneCounter,argArr);
		}
		return argArr;	
	}
	
	
	
	
	public static void main(String[] args) {

		Segregator segregator=new Segregator();
		System.out.println(Arrays.toString(segregator.solution(new int[]{0, 1, 0, 1, 1, 1})));
		System.out.println(Arrays.toString(segregator.solution2(new int[]{0, 1, 0, 1, 1, 1})));
		
	}

}

