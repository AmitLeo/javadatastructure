package dp.pages.fourth;

/**
 * Dynamic Programming | Set 5 (Edit Distance) Given two strings str1 and str2 and below operations that can
 * performed on str1. Find minimum number of edits (operations) required to convert ‘str1′ into ‘str2′. Insert
 * Remove Replace All of the above operations are of equal cost.
 * @author amishash
 *
 */
public class EditDistance {

  public int solution(String argString1, String argString2) {
    int tebul[][] = new int[argString1.length() + 1][argString2.length() + 1];
    for (int i = 1; i < tebul.length; i++ ) {
      for (int j = 1; j < tebul[i].length; j++ ) {
        if (argString1.charAt(i - 1) == argString2.charAt(j - 1)) {
          tebul[i][j] = tebul[i - 1][j - 1] + 1;
        }
        else {
          if (tebul[i - 1][j] >= tebul[i][j - 1]) {
            tebul[i][j] = tebul[i - 1][j];
          }
          else {
            tebul[i][j] = tebul[i][j - 1];
          }
        }
      }
    }
    return Math.abs(argString2.length() - (tebul[argString1.length()][argString2.length()]));
  }

  public static void main(String[] args) {
    EditDistance editDistance = new EditDistance();
    System.out.println(editDistance.solution("geek", "gesek"));
    System.out.println(editDistance.solution("cat", "cut"));
    System.out.println(editDistance.solution("sunday", "saturday"));

  }

}
