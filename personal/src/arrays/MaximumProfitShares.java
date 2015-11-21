package arrays;
/**
 * Maximum profit by buying and selling a share at most twice
 * In a daily share trading, a buyer buys shares in the morning and sells it on same day. 
 * If the trader is allowed to make at most 2 transactions in a day, where as second transaction can only start after first 
 * one is complete (Sell->buy->sell->buy). Given stock prices throughout day, find out maximum profit that a share trader could have made.
 * 
 * http://www.geeksforgeeks.org/maximum-profit-by-buying-and-selling-a-share-at-most-twice/
 *  
 * @author amishash
 *
 */

public class MaximumProfitShares {

  public void solution(int argArr[]){

    int profit[]=new int[argArr.length];

    for(int i=argArr.length-2;i>0;i--)
    {
      if(argArr[i]>argArr[i+1])
        profit[i]=argArr[i];
      else
        profit[i]=argArr[i+1];
    }
    for(int i=0;i<argArr.length-2;i++)
    {
      if(argArr[i]>argArr[i+1])
        profit[i]=argArr[i];
      else
        profit[i]=argArr[i+1];
    }
    int mx1=profit[0];
    int mx2=profit[0];
    
    for(int i=0;i<argArr.length;i++)
    {
      
    }
    
    
  
  }
  
  public static void main(String[] args) {
    MaximumProfitShares maximumProfitShares=new MaximumProfitShares();
    maximumProfitShares.solution(new int[] {10, 22, 5, 75, 65, 80});
  }

}
