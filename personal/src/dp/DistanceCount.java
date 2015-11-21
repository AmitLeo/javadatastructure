package dp;

/**
 * Count number of ways to cover a distance
 * Given a distance ‘dist, count total number of ways to cover the distance with 1, 2 and 3 steps.
 * 
 * @author amishash
 * 
 * http://www.geeksforgeeks.org/count-number-of-ways-to-cover-a-distance/
 */
public class DistanceCount {
  
  public int solution(int argInt)
  {
    int tempArr[]=new int[argInt];
    // 1
    tempArr[0]=1;
    // 2
    tempArr[1]=2;
    
    for(int i =2;i<argInt;i++)
      tempArr[i]=tempArr[i-1]+tempArr[i-2]+1;
    return tempArr[argInt-1];
  }

  public static void main(String[] args) {
    
    DistanceCount distanceCount=new DistanceCount();
    System.out.println(distanceCount.solution(4));

  }

}
