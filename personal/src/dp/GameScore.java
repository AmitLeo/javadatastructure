package dp;

import java.util.Arrays;

public class GameScore {
 
  private void solution(int argN)
  {
    int memTable[]=new int[argN+1];
    memTable[0] = 1;
    for (int i=3; i<=argN; i++)
      memTable[i] += memTable[i-3];
    System.out.println(Arrays.toString(memTable));
    for (int i=5; i<=argN; i++)
      memTable[i] += memTable[i-5];
    System.out.println(Arrays.toString(memTable));
    for (int i=10; i<=argN; i++)
      memTable[i] += memTable[i-10];
    System.out.println(Arrays.toString(memTable));
  }
 
  
  public static void main(String[] args) {
    GameScore gs=new GameScore();
    gs.solution(20);
  }
}
