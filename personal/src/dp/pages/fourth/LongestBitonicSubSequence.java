package dp.pages.fourth;

import java.util.Arrays;

/**
 * 
 * http://www.geeksforgeeks.org/dynamic-programming-set-15-longest-bitonic-subsequence/
 * Dynamic Programming | Set 15 (Longest Bitonic Subsequence)
 * 
 * @author amishash
 *
 */
public class LongestBitonicSubSequence {
 
  
  private int[] getTabul(int argSize)
  {
    int []tabul=new int[argSize];
    for(int i =0;i<tabul.length;i++)
      tabul[i]=1;
    return tabul;
  }
  
  private int[] logestBitonicSubSequence(int argArr[])
  {
    int tabul[]=getTabul(argArr.length);
    for(int i=1;i<argArr.length;i++)
    {
      for(int j=0;j<i;j++)
      {
        if(argArr[i]>argArr[j] && tabul[j]+1>tabul[i])
          tabul[i]=tabul[j]+1;
      }
    }
    System.out.println(Arrays.toString(tabul));
    return tabul;
  }
  
  private int [] reverseBitonicSubsequence(int argArr[])
  {
    int tabul[]=getTabul(argArr.length);
    for(int i=1;i<argArr.length;i++)
    {
      for(int j=0;j<i;j++)
      {
        if(argArr[i]<argArr[j] && tabul[j]<tabul[i]+1)
          tabul[i]=tabul[j]+1;
      }
    }
    System.out.println(Arrays.toString(tabul));
    return tabul;
  }
  
  public int solution(int  argArr[])
  {
    int inc_subSeq[]=logestBitonicSubSequence(argArr);
    int dec_subSeq[]=reverseBitonicSubsequence(argArr);
    int max_sub=0;
    for(int i=0;i<inc_subSeq.length;i++)
    {
      if(max_sub<((inc_subSeq[i]+dec_subSeq[i])-1))
        max_sub=(inc_subSeq[i]+dec_subSeq[i])-1;
    }
    
    return max_sub;
  }
  public static void main(String[] args) {
    LongestBitonicSubSequence longestBitonicSubSequence=new LongestBitonicSubSequence();
    System.out.println(longestBitonicSubSequence.solution(new int[]{1, 11, 2, 10, 4, 5, 2, 1}));
    System.out.println(longestBitonicSubSequence.solution(new int[]{12, 11, 40, 5, 3, 1}));
    System.out.println(longestBitonicSubSequence.solution(new int[]{80, 60, 30, 40, 20, 10}));
  }

}
