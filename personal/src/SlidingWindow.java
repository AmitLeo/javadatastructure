import java.util.HashSet;
import java.util.Set;


public class SlidingWindow {

  
  public static void sumElements(int arr[][],int x,int y)
  {
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
      if(i==x)
        continue;
     for(int j=0;j<arr[i].length;j++)
     {
       if(j==y)
         continue;
       sum=sum+arr[i][j];
     }
    }
    System.out.println(sum);
  }
  
  
  
  
  
  private static void slidingWindow(int arr[],int size)
  {
    Set <Integer> uniqueElemen=new HashSet<Integer>(size);
    for(int i =0;i<size;i++)
    {
      uniqueElemen.add(arr[i]);
    }
    System.out.println(uniqueElemen.size());
    
    for(int i=size;i<arr.length;i++)
    {
      uniqueElemen.remove(arr[i-size]);
      uniqueElemen.add(arr[i]);

      System.out.println(uniqueElemen.size());
    }
  }
  
  public static void main(String...s)
  {
    
    slidingWindow(new int[]{1, 2, 1, 3, 4, 2, 3},4);
    
    sumElements(new int[][]{ {1, 1, 2},    {3, 4, 6},    {5, 3, 2} },0,1);
    
  }
}
