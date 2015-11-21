package dp.pages.fourth;


/**
 * Dynamic Programming | Set 13 (Cutting a Rod)
 * 
 * Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller
 * than n. Determine the maximum value obtainable by cutting up the rod and selling the pieces. For example,
 * if length of the rod is 8 and the values of different pieces are given as following, then the maximum
 * obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)
 * 
 * @author amishash
 *
 */
public class RodeCutting {

  public int solution(int argArr[], int argInt) {
    int tabul[][] = new int[argArr.length + 1][argInt + 1];

    for (int i = 1; i < tabul.length; i++ ) {
      tabul[i][0] = argArr[i - 1];
    }
    for (int j = 1; j < tabul[0].length; j++ ) {
      tabul[0][j] = j;
    }
    for (int i = 1; i < tabul.length; i++ ) {
      for (int j = 1; j < tabul[i].length; j++ ) {
        if (j >= i) {
          int rem = (tabul[i][j - i]);
          if (j - i == 0) rem = 0;
          tabul[i][j] = Math.max(tabul[i][0] + rem, tabul[i - 1][j]);
        }
        else
          tabul[i][j] = tabul[i - 1][j];
      }
    }
    // DisplayUtils.displayTwoDimensionArray(tabul);
    return tabul[tabul.length - 1][tabul[tabul.length - 1].length - 1];
  }

  public static void main(String[] args) {
    RodeCutting rodeCutting = new RodeCutting();
    System.out.println(rodeCutting.solution(new int[] {1, 5, 8, 9, 10, 17, 17, 20}, 5));
  }

}
