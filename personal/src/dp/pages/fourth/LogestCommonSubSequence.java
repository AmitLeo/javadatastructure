package dp.pages.fourth;

import utils.DisplayUtils;

/**
 * ABCBDAB BDCABA the longest common subsequence of this problem is [BCBA]
 * Dynamic Programming | Set 4 (Longest Common Subsequence)
 * We have discussed Overlapping Subproblems and Optimal Substructure properties in Set 1 and Set 2 respectively. We also discussed one example problem in Set 3. Let us discuss Longest Common Subsequence (LCS) problem as one more example problem that can be solved using Dynamic Programming.
 * LCS Problem Statement: Given two sequences, find the length of longest subsequence present in both of them. A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”. So a string of length n has 2^n different possible subsequences.
 * 
 * http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/
 * @author amishash
 *
 */

public class LogestCommonSubSequence {
  
  int memoized[][];
  
  public void solution(String argString1, String argString2) {
    memoized = new int[argString1.length() + 1][argString2.length() + 1];
    for (int i = 0; i < memoized.length; i++ ) {
      for (int j = 0; j < memoized[i].length; j++ ) {
        memoized[i][j]=0;
      }
    }
    for (int i = 1; i < memoized.length; i++ ) {
      for (int j = 1; j < memoized[i].length; j++ ) {
        if (argString1.charAt(i-1) == argString2.charAt(j-1)) {
          memoized[i][j]= memoized[i-1][j-1]+1;
        }else {
            memoized[i][j]= Math.max(memoized[i-1][j],memoized[i][j-1]);
          }
      }
    }
    DisplayUtils.displayTwoDimensionArray(memoized);
    System.out.println("largest Subsequence count "+memoized[memoized.length-1][memoized[0].length-1]);
  }
  public void printSubSequence(String argString1, String argString2){
  
    int i =memoized.length-1;
    int j=memoized[0].length-1;
    StringBuffer sb=new StringBuffer();
    while(i>0 && j>0)
    {
      if(memoized[i][j]==memoized[i][j-1])
        j--;
      else{
        sb.append(argString1.charAt(j));
        i--;
        j--;
      }
    }
    System.out.println(sb);
  }

  public static void main(String[] args) {
    LogestCommonSubSequence logestCommonSubSequence = new LogestCommonSubSequence();
    logestCommonSubSequence.solution("ABCBDAB", "BDCABA");
    logestCommonSubSequence.printSubSequence("ABCBDAB", "BDCABA");
  }

}
