package arrays;

import java.util.Arrays;
/**
 * Pythagorean Triplet in an array
 * Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.
 * http://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/
 * @author amishash
 *
 */

public class PythagoreanTriplet {

  public void solution(int arr[])
  {
    Arrays.sort(arr);
    for(int k=arr.length-1;k>=0;k--)
    {
      int i=0;
      int j=k-1;
      while(i<j)
      {
        if(arr[k]*arr[k]==(arr[i]*arr[i]+arr[j]*arr[j]))
        {
          System.out.println("Element at Index "+i +" is "+arr[i]);
          System.out.println("Element at Index "+j +" is "+arr[j]);
          break;
        }else if(arr[k]*arr[k]>(arr[i]*arr[i]+arr[j]*arr[j]))
        {
          i++;
        }else
        {
          j--;
        }
      }
    }
  }
  
  public static void main(String ...s)
  {
    PythagoreanTriplet pythagoreanTriplet=new PythagoreanTriplet();
    pythagoreanTriplet.solution(new int []{3, 1, 4, 6, 5});
    
    
  }
}
