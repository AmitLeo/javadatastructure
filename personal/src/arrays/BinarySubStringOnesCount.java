package arrays;
/**
 * Given a binary string, count number of substrings that start and end with 1.
 * Given a binary string, count number of substrings that start and end with 1. 
 * For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
 *
 * @author amishash
 *
 */
public class BinarySubStringOnesCount {
  public void solution(String argString)
  {
    int count=0;
    for(int i=0;i<argString.length();i++){
      if(argString.charAt(i)=='1'){
        if(count==0)
          count++;
        else
          count=count+count;     
      }
    }
    System.out.println(count);
  }
  
  public static void main(String[] args) {
    BinarySubStringOnesCount binarySubStringOnesCount=new BinarySubStringOnesCount();
    binarySubStringOnesCount.solution("10111");
    binarySubStringOnesCount.solution("00100101");
  }




}
