package dp.pages.fourth;

import utils.DisplayUtils;

/**
 * Maximum size square sub-matrix with all 1s Given a binary matrix, find out the maximum size square
 * sub-matrix with all 1s.
 * 
 * http://www.geeksforgeeks.org/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/
 * 
 * @author amishash
 *
 */
public class MaximumSizeSquareSubMatrix {

  public void solution(int argArr[][]) {
    int auxArr[][] = new int[argArr.length][argArr[0].length];
    for (int i = 0; i < argArr.length; i++ )
      auxArr[i][0] = argArr[i][0];
    for (int j = 0; j < argArr[0].length; j++ )
      auxArr[0][j] = argArr[0][j];
    for (int i = 1; i < auxArr.length; i++ ) {
      for (int j = 1; j < auxArr[i].length; j++ )
        auxArr[i][j] = (Math.min(argArr[i - 1][j], Math.min(argArr[i][j - 1], argArr[i - 1][j - 1]))) + 1;
    }
    DisplayUtils.displayTwoDimensionArray(auxArr);
  }

  public static void main(String[] args) {
    MaximumSizeSquareSubMatrix maxSizeSquareSubMatrix = new MaximumSizeSquareSubMatrix();
    maxSizeSquareSubMatrix.solution(new int[][] { {0, 1, 1, 0, 1}, {1, 1, 0, 1, 0}, {0, 1, 1, 1, 0},
        {1, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {0, 0, 0, 0, 0}});
  }
}
