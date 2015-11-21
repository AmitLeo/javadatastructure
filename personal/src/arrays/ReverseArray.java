package arrays;
/**
 * Write a program to reverse an array
 * http://www.geeksforgeeks.org/write-a-program-to-reverse-an-array/
 * @author amishash
 *
 */

public class ReverseArray {

  public void solution(int arr[])
  {
    for(int i=0;i<arr.length/2;i++)
    {
      int temp=arr[i];
      arr[i]=arr[ (arr.length-1)-i ];
      arr[ (arr.length-1)-i ]=temp;
    }
    print(arr);
  }

  public void print(int argArr[])
  {
      for(int i=0;i<argArr.length;i++)
        System.out.println(argArr[i]);
  }
  
  public static void main(String ...s)
  {
    ReverseArray reverseArray=new ReverseArray();
    reverseArray.solution( new int[] {1, 2, 3, 4, 5, 6});
    
  }
  
}
