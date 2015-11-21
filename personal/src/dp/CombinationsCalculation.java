package dp;

public class CombinationsCalculation {

  
  private int fact(int n )
  {
    if( n==1)
      return 1;
    else
      return n*fact(n-1);
  }
  
  public int  NCR(int argN,int argR)
  {
    return fact(argN)/(fact(argN-argR)*fact(argR));
  }
  
  public static void main(String[] args) {

    CombinationsCalculation combinationsCalculation=new CombinationsCalculation();
    System.out.println(combinationsCalculation.NCR(4,2));
    System.out.println(combinationsCalculation.NCR(4,1));
  }

}
