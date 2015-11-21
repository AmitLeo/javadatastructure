package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Find a common element in all rows of a given row-wise sorted matrix
 * 
 * Given a matrix where every row is sorted in increasing order. Write a function that finds and returns a
 * common element in all rows. If there is no common element, then returns -1.
 * 
 * http://www.geeksforgeeks.org/find-common-element-rows-row-wise-sorted-matrix/
 * 
 * @author amishash
 *
 */
public class CommomElementInRows {

  int smallestRowIndex = 0;
  int index;
  int smallestElement;

  public void hashingSolution(int argArr[][]) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < argArr.length; i++ ) {
      for (int j = 0; j < argArr[i].length; j++ ) {
        Integer tempCheck = map.get(argArr[i][j]);
        if (tempCheck == null) {
          if (i == 0) map.put(argArr[i][j], i);
        }
        else {
          if (tempCheck != i && tempCheck == i - 1) map.put(argArr[i][j], i);
        }
      }
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == argArr.length - 1) System.out.println(entry.getKey());
    }

  }

  public void solution(int argArr[][]) {
    index = argArr[0].length;
    int smallestElement = smallestElement(argArr);
    if (checkSmallestElementExistInRow(argArr, smallestElement)) ;
    System.out.println(smallestElement);
  }

  private int smallestElement(int argArr[][]) {
    smallestElement = argArr[0][index - 1];
    index = index - 1;
    smallestRowIndex = 0;
    for (int i = 1; i < argArr.length; i++ ) {
      if (argArr[i][index - 1] < smallestElement) {
        smallestElement = argArr[i][index - 1];
        index = index - 1;
        smallestRowIndex = i;
      }
    }
    return smallestElement;
  }

  private boolean checkSmallestElementExistInRow(int argArr[][], int argSmallestElem) {
    for (int i = 0; i < argArr.length; i++ ) {
      int length = argArr[i].length - 1;
      boolean flag = false;
      while (length >= 0) {
        if (argArr[i][length] == argSmallestElem) {
          flag = true;
          break;
        }
        length-- ;
      }
      if (!flag) return false;
    }
    return true;
  }

  public static void main(String... s) {

    int mat[][] = { {1, 2, 3, 4, 5}, {2, 4, 5, 8, 10}, {3, 5, 7, 9, 11}, {1, 3, 5, 7, 9},};
    CommomElementInRows commomElementInRows = new CommomElementInRows();
    // commomElementInRows.solution(mat);
    commomElementInRows.hashingSolution(mat);
  }
}
