package arrays;
/**
 * 
 * Divide and Conquer | Set 7 (The Skyline Problem)
Given n rectangular buildings in a 2-dimensional city, computes the skyline of these buildings, eliminating hidden lines.
The main task is to view buildings from a side and remove all sections that are not visible.
All buildings share common bottom and every building is represented by triplet (left, ht, right)
‘left': is x coordinated of left side (or wall).
‘right': is x coordinate of right side
‘ht': is height of building.
For example, the building on right side (the figure is taken from here) is represented as (1, 11, 5)
A skyline is a collection of rectangular strips. A rectangular strip is represented as a pair (left, ht) where left is x coordinate of left side of strip and ht is height of strip.
 * 
 * http://www.geeksforgeeks.org/divide-and-conquer-set-7-the-skyline-problem/
 * @author amishash
 *
 */
public class SkyLine {
  public void solution(int argArr[][])
  {
    int arr[]=new int[30];
    for(int i=0;i<argArr.length;i++)
    {
      for(int j=argArr[i][0];j<argArr[i][2];j++)
      {
        if(arr[j]<argArr[i][1])
          arr[j]=argArr[i][1];
      }
    }
    int prev=-1;
    for(int i=0;i<arr.length;i++)
    {
      if(prev !=arr[i]  ){ 
        prev=arr[i];
        System.out.println("Index "+i+" value "+arr[i]);
      }
    }
  }
  
  public static void main(String[] args) {
    
    SkyLine skyLine=new SkyLine();
    
    int skyArr[][] = { {1, 11, 5}, 
                     {2, 6, 7}, 
                     {3, 13, 9},
                     {12, 7, 16},
                     {14, 3, 25}, 
                     {19, 18, 22},
                     {23, 13, 29}, 
                     {24, 4, 28}};
    skyLine.solution(skyArr);
  }

}
