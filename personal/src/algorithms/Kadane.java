package algorithms;

/**
 * 
 * Largest Sum Contiguous Subarray
 * 
 * Write an efficient C program to find the sum of contiguous subarray within a one-dimensional array of
 * numbers which has the largest sum.
 * http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 * @author amishash
 *
 */
public class Kadane {

  public void maxSumSubArray(int arr[]) {
    int curr_max = -10000000;
    int max = 0;

    for (int i = 0; i < arr.length; i++ ) {
      if (curr_max < 0) {
        curr_max = arr[i];
      }
      else {
        curr_max = curr_max + arr[i];
      }
      if (curr_max > max) {
        max = curr_max;
      }
    }
    System.out.println(max);
  }

  public static void main(String[] args) {
    Kadane kadane = new Kadane();
    kadane.maxSumSubArray(new int[] {-1, -2, 3, 4, -5, 6});
  }

}
