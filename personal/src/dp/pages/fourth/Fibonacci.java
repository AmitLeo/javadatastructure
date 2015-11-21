package dp.pages.fourth;

/**
 * The Fibonacci numbers are the numbers in the following integer sequence. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
 * 55, 89, 141, …….. In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence
 * relation
 * 
 * http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
 * @author amishash
 */
class Fibonacci {

  public void solution(int argNumber) {
    int prev, next, sum, n;
    prev = 0;
    next = 1;
    for (n = 0; n <= argNumber; n++ ) {
      System.out.println(prev);
      sum = prev + next;
      prev = next;
      next = sum;
    }
  }

  public static void main(String args[]) {
    Fibonacci fibonacci = new Fibonacci();
    fibonacci.solution(10);
  }
}
