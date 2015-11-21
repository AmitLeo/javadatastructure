package dp;

import utils.DisplayUtils;

/**
 * 
 * Find the longest path in a matrix with given constraints
 * Given a n*n matrix where numbers all numbers are distinct and are distributed from range 1 to n2, find the maximum length path (starting from any cell) such that all cells along the path are increasing order with a difference of 1.
 * We can move in 4 directions from a given cell (i, j), i.e., we can move to (i+1, j) or (i, j+1) or (i-1, j) or (i, j-1) with the condition that the adjacen
 * 
 * @author amishash
 *
 */
public class MatrixLongetPath {
  
  public void solution(int argMatrix[][])
  {
    int memoizedArr[][]=new int[argMatrix.length][argMatrix.length];
    for(int i=0;i<argMatrix.length;i++)
    {
      for(int j=0;j<argMatrix.length;j++)
      {
        int orgI=i;
        int orgJ=j;
        boolean flag=true;
        int tempCount=1;
       while(flag){
         flag=false;
          if(i+1<argMatrix.length && argMatrix[i+1][j]-argMatrix[i][j]==1){
            i=i+1;
            tempCount++;
            flag=true;
          }
          else if(i-1>=0 && argMatrix[i-1][j]-argMatrix[i][j]==1){
            i=i-1;
            tempCount++;
            flag=true;
          }
          else if(j+1<argMatrix.length && argMatrix[i][j+1]-argMatrix[i][j]==1){
            j=j+1;
            tempCount++;
            flag=true;
          }
          else if(j-1>=0&& argMatrix[i][j-1]>argMatrix[i][j]){
            j=j-1;
            tempCount++;
            flag=true;
          }
       }
       i=orgI;
       j=orgJ;
       memoizedArr[i][j]=tempCount;
      }
    }
    DisplayUtils.displayTwoDimensionArray(memoizedArr);
  }

  public static void main(String[] args) {
    MatrixLongetPath matrixLongetPath=new MatrixLongetPath();
    int mat[][] = {{1, 2, 9},
    {5, 3, 8},
    {4, 6, 7}};
    matrixLongetPath.solution(mat);
  }

}
