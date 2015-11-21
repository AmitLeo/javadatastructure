package arrays;

import java.util.Arrays;


/**
 * This class will check if one swap is sufficient to make partial sorted array to a sorted array.
 * 
 * @author amishash
 *
 */
public class SortedArraySwaps {
  
  private int _test_arr1[]={1,4,3,5,1};
  private int _test_arr2[]={1,4,1,5,6};
  private int _test_arr3[]={5,1,1,4};
  private int _test_arr4[]={1,9,9,8,7};
  private int _test_arr5[]={1,2,4,8,7,7};
  private int _test_arr6[]={1,2,7,6,7,8,7};
  private int _test_arr7[]={1, 2, 5, 4, 3};// true
  private int _test_arr8[]={1, 2, 3, 5, 4}; //true
  private int _test_arr9[]={1, 4, 3, 2, 5}; //true
  private int _test_arr10[]={1, 5, 4, 3, 2}; //false
  private int _test_arr11[]={1, 5, 3, 3, 7};// true
  private int _test_arr12[]={2, 2, 1, 3, 7}; //true
  private int _test_arr13[]={2, 3, 1, 3, 7}; //false
  private int _test_arr14[]={1, 3, 1, 3, 7}; //true
  private int _test_arr15[]={2, 1, 1, 3, 7}; //true
  
  
  private void swap(int argArr[], int argIndex1, int argIndex2)
  {
    int temp= argArr[argIndex1];
    argArr[argIndex1]=argArr[argIndex2];
    argArr[argIndex2]=temp;
  }
  
  private  boolean isOneSwapSufficient(int[] argArr)
  {
    boolean swap=false;
    for(int i=0;i<argArr.length-1;i++)
    {
      if(argArr[i]>=argArr[i+1])
      {
        if(swap)
          return false;
        if(argArr[i]!=argArr[i+1])
          i++;
        if(i+1<argArr.length && i-1>=0)
        { 
          if(argArr[i+1]>argArr[i-1] && argArr[i+1]!=argArr[i-1])
          {
            swap(argArr,i,i-1);
            swap=true;
          }else if( argArr[i+1]<argArr[i-1] && argArr[i+1]!=argArr[i-1])
          {
            swap(argArr,i-1,i+1);
            swap=true;
          }else if(argArr[i+1]==argArr[i-1])
          {
            if(i-2>=0 && argArr[i-2] >argArr[i] )
              return false;
            swap(argArr,i-1,i);
            swap=true;
          }
        }
      }
    }
    return true;
  }
  
  public static void main(String... args)
  {
    SortedArraySwaps sortedArraySwaps=new SortedArraySwaps();
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr1 ) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr1)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr2 ) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr2)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr3 ) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr3)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr4 ) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr4)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr5 ) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr5)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr6 ) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr6)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr7 ) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr7)+"");
    
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr8 ) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr8)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr9 ) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr9)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr10 ) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr10)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr11) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr11)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr12 ) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr12)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr13) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr13)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr14) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr14)+"");
    System.out.println("For Array" + Arrays.toString( sortedArraySwaps._test_arr15) +" "+sortedArraySwaps.isOneSwapSufficient(sortedArraySwaps._test_arr15)+"");
  }

}
