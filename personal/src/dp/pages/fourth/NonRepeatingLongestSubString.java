package dp.pages.fourth;

import java.util.HashSet;
import java.util.Set;

import utils.DisplayUtils;

/**
 * Length of the longest substring without repeating characters
 * 
 * @author amishash
 * http://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/
 */
public class NonRepeatingLongestSubString {

    
  public int solution(String argString1,String argString2)
  {
    Set<Character> longestSubstring=new HashSet<Character>();
    int tebul[][]=new int[argString1.length()+1][argString2.length()+1];
    int max=0;
    for(int i=1;i<tebul.length;i++)
    {
      for(int j=1;j<tebul[i].length;j++)
      {
        if((argString1.charAt(i-1)==argString2.charAt(j-1)) && (!longestSubstring.contains(argString2.charAt(j-1)))){
          tebul[i][j]=tebul[i-1][j-1]+1;
          if(max<tebul[i][j])
            max=tebul[i][j];
            longestSubstring.add(argString2.charAt(j-1));
        }
      }
    }
    DisplayUtils.displayTwoDimensionArray(tebul);
    return  max;
  }
 
  
  public static void main(String[] args) {

    NonRepeatingLongestSubString nonRepeatingLongestSubString=new NonRepeatingLongestSubString();
    System.out.println(nonRepeatingLongestSubString.solution("ABDEFGABEF" , "BDEFGA"));
  }

}
