package dp.pages.fourth;

import utils.DisplayUtils;

public class LongestCommonSubString {

  private int solution(String string1, String string2) {
    int darr[][] = new int[string1.length()][string2.length()];
    int max = 0;
    for (int i = 1; i < darr.length; i++ ) {
      for (int j = 1; j < darr[i].length; j++ ) {
        if (string1.charAt(i - 1) == string2.charAt(j - 1)) {
          darr[i][j] = darr[i - 1][j - 1] + 1;
          if (max < darr[i][j]) max = darr[i][j];
        }
      }
    }
    DisplayUtils.displayTwoDimensionArray(darr);
    return max;
  }

  public static void main(String... s) {

    LongestCommonSubString longestCommonSubString = new LongestCommonSubString();
    System.out.println(longestCommonSubString.solution("abcdefghij", "cdefi"));

  }

}
