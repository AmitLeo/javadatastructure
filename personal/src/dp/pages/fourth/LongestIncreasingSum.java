package dp.pages.fourth;

import java.util.Arrays;
/**
 * 
 * Dynamic Programming | Set 3 (Longest Increasing Subsequence)
 * We have discussed Overlapping Subproblems and Optimal Substructure properties in Set 1 and Set 2 respectively.
 * Let us discuss Longest Increasing Subsequence (LIS) problem as an example problem that can be solved using 
 * Dynamic Programming.
 * The longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a 
 * given sequence such that all elements of the subsequence are sorted in increasing order. 
 * 
 * For example, length of LIS for { 10, 22, 9, 33, 21, 50, 41, 60, 80 } is 6 and LIS is {10, 22, 33, 50, 60, 80}.
 * 
 * http://www.geeksforgeeks.org/dynamic-programming-set-14-maximum-sum-increasing-subsequence/
 * 
 * @author amishash
 *
 */

public class LongestIncreasingSum {

  public int solution(int argArr[]) {
    int mem[] = new int[argArr.length];
    for (int i = 0; i < argArr.length; i++ )
      mem[i] = argArr[i];
    int max_value = mem[0];
    for (int i = 0; i < argArr.length; i++ ) {
      for (int j = 0; j < i; j++ ) {
        if (argArr[j] < argArr[i] && (mem[j] + argArr[i] > mem[i])) mem[i] = mem[j] + argArr[i];
        if (mem[i] > max_value) max_value = mem[i];
      }
    }
    System.out.println(Arrays.toString(mem));
    return max_value;
  }

  public static void main(String[] args) {
    LongestIncreasingSum longestIncreasingSum = new LongestIncreasingSum();
    System.out.println(longestIncreasingSum.solution(new int[] {10, 22, 9, 33, 21, 50, 41, 60, 80}));
  }

}
