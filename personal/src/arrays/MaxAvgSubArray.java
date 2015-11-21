package arrays;

/**
 * Given an array with positive and negative numbers, find the maximum average subarray of given length.
 * 
 * http://www.geeksforgeeks.org/find-maximum-average-subarray-of-k-length/
 * 
 * @author amishash
 *
 */
public class MaxAvgSubArray {

  public void solution(int argArr[], int argLength) {
    int counter = 0;
    int maxAvgSum = 0;
    int startingIndex=0;
    int tempSum = 0;
    for (int i = 0; i < argArr.length; i++ ) {
      counter++ ;
      tempSum = tempSum + argArr[i];
      if (counter != argLength) {
        continue;
      }
      else {
        if (maxAvgSum < tempSum / argLength) {
          maxAvgSum = tempSum / argLength;
          startingIndex=i+1-(argLength);
        }
        tempSum = tempSum - argArr[i+1-(argLength)];
        counter-- ;
      }
    }
    System.out.println("Max Sum is "+ maxAvgSum+" begins at Index "+startingIndex);
  }

  public static void main(String args[]) {
    MaxAvgSubArray maxAvgSubArray = new MaxAvgSubArray();
    maxAvgSubArray.solution(new int[] {1, 12, -5, -6, 50, 3}, 4);
  }
}
