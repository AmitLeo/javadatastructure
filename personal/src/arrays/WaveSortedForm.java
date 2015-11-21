package arrays;

import java.util.Arrays;

/**
 * Given an unsorted array of integers, sort the array into a wave like array. 
 * An array ‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >=
 * 
 * http://www.geeksforgeeks.org/sort-array-wave-form-2/
 *  
 * @author amishash
 *
 */
public class WaveSortedForm {

  int arr[];
  public void solution(int argArr[])
  {
    this.arr=argArr;
    for(int i=2;i<argArr.length;i=i+2)
    {
      Arrays.sort(argArr,i-2,i);
      swap(i-2,i-1);
    }
    System.out.println(Arrays.toString(arr));
  }
  
  public void swap(int argIndex1,int argIndex2)
  {
    int temp=arr[argIndex1];
    arr[argIndex1]=arr[argIndex2];
    arr[argIndex2]=temp;
  }
  
  public static void main(String[] args) {
    WaveSortedForm  waveSortedForm=new WaveSortedForm();
    waveSortedForm.solution(new int []{10, 5, 6, 3, 2, 20, 100, 80});

  }
}
