package dp.pages.fourth;

import utils.DisplayUtils;

/**
 *
 * Given a cost matrix cost[][] and a position (m, n) in cost[][], write a function that returns cost of
 * minimum cost path to reach (m, n) from (0, 0). Each cell of the matrix represents a cost to traverse
 * through that cell. Total cost of a path to reach (m, n) is sum of all the costs on that path (including
 * both source and destination). You can only traverse down, right and diagonally lower cells from a given
 * cell, i.e., from a given cell (i, j), cells (i+1, j), (i, j+1) and (i+1, j+1) can be traversed. You may
 * assume that all costs are positive integers. For example, in the following figure, what is the minimum cost
 * path to (2, 2)?
 * 
 * @author amishash
 *
 */
public class MinimumCostPath {

  private int solution(int argArr[][], int argX, int argY) {
    int tab[][] = new int[argArr.length][argArr[0].length];
    tab[0][1] = argArr[0][1];
    tab[1][0] = argArr[1][0];
    for (int j = 1; j < tab.length; j++ )
      tab[0][j] = tab[0][j - 1] + argArr[0][j];
    for (int j = 0; j < tab.length; j++ )
      tab[j][0] = argArr[j][0];

    for (int i = 1; i < tab.length; i++ ) {
      for (int j = 1; j < tab.length; j++ )
        tab[i][j] =
            Math.min(argArr[i - 1][j] + argArr[i][j],
                Math.min(argArr[i - 1][j - 1] + argArr[i][j], argArr[i][j - 1] + argArr[i][j]));
    }
    DisplayUtils.displayTwoDimensionArray(tab);
    return tab[argX][argY];
  }

  public static void main(String[] args) {
    MinimumCostPath minimumCostPath = new MinimumCostPath();
    System.out.println(minimumCostPath.solution(new int[][] { {1, 2, 3}, {4, 8, 2}, {1, 5, 3}}, 2, 2));
  }

}
