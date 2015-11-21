package arrays;
/**
 * Find the odd appearing element in O(Log n) time
 * Given an array where all elements appear even number of times except one. All repeating occurrences of elements appear in pairs and these pairs are not adjacent (there cannot be more than two consecutive occurrences of any element). Find the element that appears odd number of times.
 * Note that input like {2, 2, 1, 2, 2, 1, 1} is valid as all repeating occurrences occur in pairs and these pairs are not adjacent. Input like {2, 1, 2} is invalid as repeating elements don’t appear in pairs. Also, input like {1, 2, 2, 2, 2} is invalid as two pairs of 2 are adjacent. Input like {2, 2, 2, 1} is also invalid as there are three consecutive occurrences of 2.
 * @author amishash
 *
 */

public class OddAppearing {

  /**
   * Complexity: O(Log n)
   * @param argArr
   */
  public void solution2(int argArr[])
  {
    bstSolution(argArr,0,argArr.length-1);
  }

  /**
   * 
   */
  public void bstSolution(int argArr[],int argStartIndex,int argEndIndex)
  {
    if(argStartIndex>=argEndIndex)
      return;
    int pivot=(argStartIndex+argEndIndex)/2;
    System.out.println("Pivot Element"+pivot);
    if(pivot%2==0)
    {
      if(argArr[pivot]!=argArr[pivot+1]){
        System.out.println(argArr[pivot]);
        return;
      }
    }else
    {
      if(argArr[pivot]!=argArr[pivot-1]){
        System.out.println(argArr[pivot]);
        return;
      }
    }
    
    bstSolution(argArr,argStartIndex,pivot-1);
    bstSolution(argArr,pivot+1,argEndIndex);
  }
  
  
  /**
   * Complexity: O(n)
   */
  public void solution1(int argArr[])
  {
    int res=argArr[0];
    for(int i=1;i<argArr.length;i++)
      res=res^argArr[i];
    System.out.println(res);
  }
  
  
  
  public static void main(String[] args) {
    int arr1[] = {1, 1, 2, 2, 1, 1, 2, 2, 13, 1, 1, 40, 40, 13, 13};
    OddAppearing oddAppearing=new OddAppearing();
 //   oddAppearing.solution1(arr1);
    oddAppearing.solution2(arr1);
  }

}
