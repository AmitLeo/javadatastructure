

public class Solution {

  
  private int crazyNumber(double argInt)
  {

    String st="1";
    String end="9";
    int totalCrazyNumbers=0;
    for(long i=0;i<argInt-1;i++)
    {
      st=st+i;
      end=end+"9";
    }

    long startingIndex=Long.parseLong(st);
    long endingIndex=Long.parseLong(end);
    for(long d=startingIndex;d<endingIndex;d++)
    {
      System.out.println(d);
      if(isCrazyNumber(d))
      {
        System.out.println("crazy"+d);
        totalCrazyNumbers++;
      }
    }
    
    if(argInt==1)
      totalCrazyNumbers=totalCrazyNumbers+2;
    return totalCrazyNumbers;
  }
  
  public boolean isCrazyNumber(long argDouble)
  {
    String temp=""+argDouble;
    if(temp.length()==1)
      return true;
    char ch[]=temp.toCharArray();
    
    int prev=ch[0];
    for(int i=1;i<ch.length;i++)
    {
      if(Math.abs(prev-ch[i])==1)
        prev=ch[i];
      else
        return false;
    }
    return true;
  }
  public static void main(String ...s){
    
    Solution slution=new Solution();
    System.out.println(slution.crazyNumber(5));
    
  }
}
