package dp.pages.fourth;

public class CoinChange {
  int count = 0;

  int count(int S[], int m, int n) {
    // If n is 0 then there is 1 solution (do not include any coin)
    if (n == 0) return 1;

    // If n is less than 0 then no solution exists
    if (n < 0) return 0;

    // If there are no coins and n is greater than 0, then no solution exist
    if (m <= 0 && n >= 1) return 0;

    // count is sum of solutions (i) including S[m-1] (ii) excluding S[m-1]
    return count(S, m - 1, n) + count(S, m, n - S[m - 1]);
  }

  public void solution(int arr[], int sum) {
    recurAlgo(arr, sum);
    System.out.println(count);
  }

  public void recurAlgo(int argArr[], int sum) {
    System.out.println("Sum" + sum);
    if (sum == 0) {
      count++ ;
      return;
    }
    else {
      for (int i = 0; i < argArr.length; i++ ) {
        if (sum - argArr[i] >= 0) recurAlgo(argArr, sum - argArr[i]);
      }
    }
  }

  public static void main(String[] args) {
    CoinChange coinChange = new CoinChange();
    // coinChange.solution(new int[] {1, 2, 3}, 4);
    System.out.println(coinChange.count(new int[] {1, 2, 3}, 3, 4));
  }

}
