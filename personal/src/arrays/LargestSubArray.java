package arrays;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Length of the largest subarray with contiguous elements | Set 1
 * Given an array of distinct integers, find length of the longest subarray which contains numbers 
 * that can be arranged in a continuous sequence.
 *
 * @author amishash
 */
public class LargestSubArray {
  
  
  public void solution3(int arr[])
  {
    int max_len = 1;  // Initialize result
    for (int i=0; i<arr.length; i++)
    {
        int mn = arr[i], mx = arr[i];
        for (int j=i+1; j<arr.length; j++)
        {
          if(arr[j]<mn)
            mn=arr[j];
          if(arr[j]>mx)
            mx=arr[j];    
            if ((mx - mn) == j-i && max_len<mx-mn+1)
                max_len = mx-mn+1;
        }
    }
    System.out.println(max_len);
  }
  
  
  public void solution2(int argArr[])
  {
    Queue<Integer> pq=new PriorityQueue<Integer>();
    for(int i=0;i<argArr.length;i++)
      pq.add(argArr[i]);
    
    int prev=pq.remove();
    int subseq=1;
    int tempSub=1;
    while(pq.size()>0){
     Integer temp=pq.remove();
      if(temp-prev==1){
       tempSub++;
      }else
      {
        if(tempSub>subseq){
          subseq=tempSub;
          tempSub=1;
        }
      }
      prev=temp;
    }
    if(tempSub>subseq)
      subseq=tempSub;
    System.out.println(subseq);
  }
  
  
  public void solution(int argArr[]){
    Arrays.sort(argArr);
    int largestSubSequence=1;
    int tempSubSequecne=1;
    for(int i=1;i<argArr.length;i++){
      if(argArr[i]-argArr[i-1]==1)
        tempSubSequecne++;
      else if(tempSubSequecne>largestSubSequence){
        largestSubSequence=tempSubSequecne;
        tempSubSequecne=0;
      }
    }   
    if(tempSubSequecne>largestSubSequence)
      largestSubSequence=tempSubSequecne;
    System.out.println(largestSubSequence);
  }

  public static void main(String[] args) {

    LargestSubArray largestSubArray=new LargestSubArray();
  /*  largestSubArray.solution(new int[]{10, 12, 11});
    largestSubArray.solution(new int[]{14, 12, 11, 20});
    largestSubArray.solution(new int[]{1, 56, 58, 57, 90, 92, 94, 93, 91, 45});
*/
    
  /*  largestSubArray.solution2(new int[]{10, 12, 11});
    largestSubArray.solution2(new int[]{14, 12, 11, 20});
    largestSubArray.solution2(new int[]{1, 56, 58, 57, 90, 92, 94, 93, 91, 45});*/
    largestSubArray.solution3(new int[]{10, 12, 11});
    largestSubArray.solution3(new int[]{14, 12, 11, 20});
    largestSubArray.solution3(new int[]{1, 56, 58, 57, 90, 92, 94, 93, 91, 45});
  }

}
