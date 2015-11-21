package dp.pages.fourth;

import utils.DisplayUtils;

/**
 * 
 * http://www.geeksforgeeks.org/dynamic-programming-set-12-longest-palindromic-subsequence/
 * 
 * Given a sequence, find the length of the longest palindromic subsequence in it. For example, if the given
 * sequence is “BBABCBCAB”, then the output should be 7 as “BABCBAB” is the longest palindromic subseuqnce in
 * it. “BBBBB” and “BBCBB” are also palindromic subsequences of the given sequence, but not the longest ones.
 * 
 * The naive solution for this problem is to generate all subsequences of the given sequence and find the
 * longest palindromic subsequence. This solution is exponential in term of time complexity. Let us see how
 * this problem possesses both important properties of a Dynamic Programming (DP) Problem and can efficiently
 * solved using Dynamic Programming.
 * @author amishash
 *
 */
public class LongestPalindromicSubsequence {

  public int solution(String argStr) {
    String reverse = new StringBuffer(argStr).reverse().toString();
    int tabul[][] = new int[argStr.length() + 1][argStr.length() + 1];
    for (int i = 1; i < tabul.length; i++ ) {
      for (int j = 1; j < tabul.length; j++ ) {
        if (argStr.charAt(j - 1) == reverse.charAt(i - 1)) {
          tabul[i][j] = tabul[i - 1][j - 1] + 1;
        }
        else {
          tabul[i][j] = Math.max(tabul[i - 1][j], tabul[i][j - 1]);
        }
      }
    }
    DisplayUtils.displayTwoDimensionArray(tabul);
    return tabul[tabul.length - 1][tabul.length - 1];
  }

  public static void main(String[] args) {
    LongestPalindromicSubsequence longestPalindromicSubsequence = new LongestPalindromicSubsequence();
    System.out.println(longestPalindromicSubsequence.solution("BBABCBCAB"));
  }

}
