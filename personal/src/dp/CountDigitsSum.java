package dp;

import java.util.Arrays;

/**
 * 
 * 
 * @author amishash
 *
 */
public class CountDigitsSum {
  
  
  private int  solution(int digits,int sum){ 
    return recursiveAlgo(new int[digits],sum,0);
  }
  
  private int recursiveAlgo(int argArr[],int sum,int index ){
    int count=0;
    int nextIndex=index+1;
    if(argArr.length==index)
    {
      if(sum==0){
        System.out.println(Arrays.toString(argArr));
        return 1;
      }
      else
        return 0;
    }else
    {
      int i=0;
      if (index==0)
        i++;
      for(;i<=9;i++)
      {
        argArr[index]=i;
        count =count+recursiveAlgo(argArr,sum-i,nextIndex);
      }
    }
    return count;
  }
  public static void main(String[] args) {
    CountDigitsSum cds=new CountDigitsSum();
    System.out.println(cds.solution(2,5));
    System.out.println(cds.solution(3,6));
  }
}
