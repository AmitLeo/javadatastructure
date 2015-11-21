package arrays;

import java.util.Stack;

/**
 * Find the nearest smaller numbers on left side in an array
 * Given an array of integers, find the nearest smaller number for every element such that the smaller element is on left side.
 *
 * @author amishash
 *
 */
public class NearestSmallerNumber {
  
  
  public void solution(int arr[])
  {
    Stack <Integer>stack=new <Integer>Stack();
    stack.push(-1);
    stack.push(arr[0]);
    System.out.println(-1);
    System.out.println(arr[0]);
    for(int i=2;i<arr.length;i++)
    {
      while(stack.peek() > arr[i])
      {
        stack.pop();
      }
      if(stack.peek()==-1)
        System.out.println(-1);
      else  
        System.out.println(stack.peek());
      stack.push(arr[i]);
    }
  }
  public static void main(String ...s )
  {
    NearestSmallerNumber nearestSmallerNumber=new NearestSmallerNumber();
    int arr[] = {1, 3, 0, 2, 5};
    int arr2[]={1, 6, 4, 10, 2, 5};
    nearestSmallerNumber.solution(arr);
    System.out.println("--------------------");
    nearestSmallerNumber.solution(arr2);
  }
}
