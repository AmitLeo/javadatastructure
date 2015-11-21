package arrays.page.four;

/**
 * http://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
 * Maximum sum such that no two elements are adjacent 
 * @author amishash
 *
 */
public class MaximumUnadjacent {

	private int solution(int argArr[])
	{
		int nonAdj=argArr[0];
		int adj= Math.max(argArr[0], argArr[1]);
		int sum=0;
		for(int j =2;j<argArr.length;j++)
		{
			sum=Math.max(nonAdj+argArr[j], adj);
			if(nonAdj+argArr[j]>adj)
			{
				int adjtemp=adj;
				adj=nonAdj+argArr[j];
				nonAdj=adjtemp;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		MaximumUnadjacent maximumUnadjacent =new MaximumUnadjacent();
		System.out.println(maximumUnadjacent.solution(new int[]{5,  5, 10, 40, 50, 35}));
		System.out.println(maximumUnadjacent.solution(new int[]{3, 2 ,5 ,10, 7}));
		
		
	}

}
