package arrays;

/**
 * Find the element that appears once in a sorted array
 * Given a sorted array in which all elements appear twice (one after one) and one element appears 
 * only once. Find that element in O(log n) complexity.
 *
 * @author amishash
 *
 */
public class UniquElemSortedArr {
  public void binarySearch(int argStartIndex,int argEndIndex,int argSortedArr[])
  {
    if(argStartIndex<0 || argEndIndex<0  ||argEndIndex<argStartIndex  || argEndIndex>=argSortedArr.length ||argStartIndex>=argSortedArr.length )
      return;
    int pivotElement=(argStartIndex+argEndIndex)/2;
    
    if(    ( (pivotElement%2==0 && argSortedArr[pivotElement+1]==argSortedArr[pivotElement]) || 
            (pivotElement%2!=0 && argSortedArr[pivotElement-1]==argSortedArr[pivotElement])
          )
      )
    {
      binarySearch(argStartIndex,pivotElement-1, argSortedArr);
      binarySearch(pivotElement+1,argEndIndex, argSortedArr);
    }else
    {
      System.out.println(argSortedArr[pivotElement]);
      return;
    }
  }
  
  
  public void solution(int argSortedArr[])
  {
    binarySearch(0,argSortedArr.length-1,argSortedArr);
  }
  
  public static void main(String[] args) {
    int arr1[] = {1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8};
    int arr2[] = {1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8};
    UniquElemSortedArr uniquElemSortedArr=new UniquElemSortedArr();
    uniquElemSortedArr.solution(arr1);
    uniquElemSortedArr.solution(arr2);
  }
}
