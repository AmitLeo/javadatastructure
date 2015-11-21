package arrays;

import java.util.Arrays;

/**
 * 
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 * Write a C program that, given an array A[] of n numbers and another number x,
 * determines whether or not there exist two elements in S whose sum is exactly x.
 * @author amishash
 *
 */
public class PairSum {

  
  public void solution(int arr[], int argArr)
  {
   Arrays.sort(arr);
   int j=arr.length-1;;
   int i=0;
   while(i<j)
   {
     if(argArr==(arr[i]+arr[j]))
     {
       System.out.println("Element at Index "+i +" is "+arr[i]);
       System.out.println("Element at Index "+j +" is "+arr[j]);
       break;
     }else if(argArr>(arr[i]+arr[j]))
     {
       i++;
     }else
     {
       j--;
     }
   }
  }
  
  
  public static void main(String[] args) {
    PairSum ps=new PairSum();
    ps.solution(new int[]{1, 4, 45, 6, 10, -8},16);
  }

}
