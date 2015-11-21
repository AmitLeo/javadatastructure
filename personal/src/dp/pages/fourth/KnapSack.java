package dp.pages.fourth;

import utils.DisplayUtils;

/**
 * Dynamic Programming | Set 10 ( 0-1 Knapsack Problem)
 * 
 * http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-problem/
 * @author amishash
 *
 */
public class KnapSack {

  public void solve() {
    int vault[][] = { {5, 7}, {3, 4}, {1, 1}, {4, 5},};
    int sackCapacity = 7;
    int arr[][] = new int[vault.length + 1][sackCapacity + 1];

    for (int i = 1; i < arr.length; i++ ) {
      for (int j = 0; j < arr[i].length; j++ ) {
        if (j - (vault[i - 1][0]) >= 0) {
          arr[i][j] = Math.max(vault[i - 1][1] + arr[i - 1][j - (vault[i - 1][0])], arr[i - 1][j]);
        }
        else {
          arr[i][j] = arr[i - 1][j];
        }
      }
    }
    DisplayUtils.displayTwoDimensionArray(arr);
  }

  public static void main(String[] args) {
    KnapSack ks = new KnapSack();
    ks.solve();
  }
}
