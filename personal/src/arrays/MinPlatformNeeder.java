package arrays;

import java.util.Arrays;

/**
 * Minimum Number of Platforms Required for a Railway/Bus Station
 * Given arrival and departure times of all trains that reach a railway station, 
 * find the minimum number of platforms required for the railway station so that no train waits.
 * We are given two arrays which represent arrival and departure times of trains that stop
 *
 * @author amishash
 */
public class MinPlatformNeeder {

  
  public void solution(int argArr[],int arrDep[])
  {
    int totalPlatforms=1;

    for(int i=1;i<argArr.length;i++)
    {
      for(int j=i-1;j>i-totalPlatforms-1;j--)
      {
        if(argArr[i]<arrDep[j]){
          totalPlatforms++;
          break;
        }else
        {
          break;
        }
      }
    }
    System.out.println(totalPlatforms);
  }
  
  
  public static void main(String[] args) {
    MinPlatformNeeder minPlatformNeeder=new MinPlatformNeeder();
    
   int arr[]  = {900,  940, 950,  1100, 1500, 1800};
   int dep[]  = {910, 1200, 1120, 1130, 1900, 2000};
   Arrays.sort(arr);
   Arrays.sort(dep);
   minPlatformNeeder.solution(arr,dep);
   
  }

}

