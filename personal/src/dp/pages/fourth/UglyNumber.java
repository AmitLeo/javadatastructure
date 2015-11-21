package dp.pages.fourth;

import java.util.HashSet;
import java.util.Set;

/**
 * Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10,
 * 12, 15, … shows the first 11 ugly numbers. By convention, 1 is included. Write a program to find and print
 * the 150’th ugly number.
 * http://www.geeksforgeeks.org/ugly-numbers/
 * @author amishash
 *
 */
public class UglyNumber {

  private void dpSolution(int argUglyCount) {
    Set<Integer> uglyNumbers = new HashSet<Integer>();
    int multiplier = 1;
    int i = 2;
    int j = 3;
    int k = 5;
    uglyNumbers.add(1);
    while (uglyNumbers.size() <= argUglyCount) {
      Set<Integer> tempSet = new HashSet<Integer>();
      tempSet.add(i * multiplier);
      tempSet.add(j * multiplier);
      tempSet.add(k * multiplier);
      uglyNumbers.addAll(tempSet);
      multiplier++ ;
    }
    System.out.println("DP solution");
    System.out.println(uglyNumbers.toString());
  }

  private void naiveSolution(int argUglyCount) {
    Set<Integer> uglyNumbers = new HashSet<Integer>();
    uglyNumbers.add(1);
    int i = 2;
    while (uglyNumbers.size() <= argUglyCount) {
      if (isUglyNumber(i)) {
        uglyNumbers.add(i);
      }
      i++ ;
    }
    System.out.println("Naive solution");
    System.out.println(uglyNumbers.toString());
  }

  private boolean isUglyNumber(int argUglyNumb) {
    if (argUglyNumb % 2 == 0 || argUglyNumb % 3 == 0 || argUglyNumb % 5 == 0)
      return true;
    else
      return false;
  }

  public static void main(String[] args) {
    UglyNumber un = new UglyNumber();
    un.naiveSolution(150);
    un.dpSolution(150);
  }

}
