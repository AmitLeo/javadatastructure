package dp;

public class CatalanNumber {
  int memoized[]=new int[10];
  
  public int solution2(int n)
  {
    if(memoized[n]!=1)
      return memoized[n];
    memoized[n]=0;
    for(int i=1;i<=n;i++)
      memoized[n]+=solution2(i-1)*solution2(n-i);
    return memoized[n];
  }
  public int solution(int n)
  {
    if(n==0)
      return 1;
    int count=0;
    for(int i =1;i<=n;i++){
      count+=solution(i-1)*solution(n-i);
      System.out.println(count);
    }
    return count;
  }

  public static void main(String[] args) {
    CatalanNumber catalanNumber=new CatalanNumber();
    System.out.println(catalanNumber.solution(3));
    for(int i =0;i<catalanNumber.memoized.length;i++)
    {
      System.out.println(catalanNumber.memoized[i]);
    }
  }

}
