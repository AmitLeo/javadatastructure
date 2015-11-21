package arrays;

import java.util.Arrays;

/**
 * Rearrange an array such that ‘arr[j]’ becomes ‘i’ if ‘arr[i]’ is ‘j’
 * Given an array of size n where all elements are in range from 0 to n-1, change contents of
 * arr[] so that arr[i] = j is changed to arr[j] = i.
 * 
 * @author amishash
 *
 */
public class Rearrange {
  
  int arr[];
  
  private void efficientSolution(int argArr[])
  {
      arr=argArr;
      for(int i=0;i<argArr.length;i++)
          recurs(argArr[i],i);
      for(int i=0;i<argArr.length;i++)
        argArr[i]=Math.abs(argArr[i])-1;
      System.out.println(Arrays.toString(argArr));
      
  }
  
  
  public void recurs(int argInt,int argIndex)
  {
    if(argInt<0)
      return ;
    while(argInt>=0)
    {
      int temp=arr[argInt];
      arr[argInt]=-(argIndex+1);
      if(temp>=0)
        recurs(temp,argInt);
      else
        return;
    }
  }
  
  
  
  
  public void simpleSolution(int argArr[])
  {
    int temp[]=new int[argArr.length];
    
    for(int i =0;i<argArr.length;i++)
      temp[argArr[i]]=i;
    System.out.println(Arrays.toString(temp));
  }

  public static void main(String[] args) {
    Rearrange rearrange=new Rearrange();
    rearrange.simpleSolution(new int[]{1, 3, 0, 2});
    rearrange.simpleSolution(new int[]{2, 0, 1, 4, 5, 3});
    rearrange.simpleSolution(new int[]{0, 1, 2, 3});
    rearrange.simpleSolution(new int[]{3, 2, 1, 0});
    
    rearrange.efficientSolution(new int[]{1, 3, 0, 2});
    rearrange.efficientSolution(new int[]{2, 0, 1, 4, 5, 3});
    rearrange.efficientSolution(new int[]{0, 1, 2, 3});
    rearrange.efficientSolution(new int[]{3, 2, 1, 0});
    
    
    
  }
}
