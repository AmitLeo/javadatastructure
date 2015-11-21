package dp.pages.fourth;

import java.util.Arrays;

/**
 * 
 * Minimum number of jumps to reach end Given an array of integers where each element represents the max
 * number of steps that can be made forward from that element. Write a function to return the minimum number
 * of jumps to reach the end of the array (starting from the first element). If an element is 0, then cannot
 * move through that element.
 * 
 * @author amishash
 *
 */
public class MinimumJumps {

  public int solution(int argArr[]) {
    int jumps[] = new int[argArr.length];
    int counter = argArr.length - 2;
    jumps[counter + 1] = 1;
    while (counter >= 0) {
      if (argArr[counter] > argArr.length - counter)
        jumps[counter] = 1;
      else {
        int min = jumps[counter + 1];
        for (int i = counter + 1; (i < (counter + argArr[counter])) && (i < jumps.length); i++ ) {
          if (min > jumps[i]) min = jumps[i];
        }
        jumps[counter] = min + 1;
      }
      counter-- ;
    }
    System.out.println(Arrays.toString(jumps));
    System.out.println(Arrays.toString(argArr));
    return jumps[0] - 1;
  }

  public static void main(String[] args) {
    MinimumJumps minimumJumps = new MinimumJumps();
    System.out.println(minimumJumps.solution(new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
  }

}
