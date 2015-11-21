package arrays;
/**
 * Find the point where maximum intervals overlap
 * Consider a big party where a log register for guest’s entry and exit times is maintained. 
 * Find the time at which there are maximum guests in the party. Note that entries in register are not in any order.
 * 
 * @author amishash
 */
public class MaximumIntervalOverlaps {
  public void solution(int argArr[],int argExit[])
  {
    int tempArr[]=new int[12];
    for(int i=0;i<argArr.length;i++)
    {
      for(int j=argArr[i];j<=argExit[i];j++)
        tempArr[j-1]=tempArr[j-1]+1;
    }
    int index=0;
    int max=tempArr[0];
    for(int k=1;k<tempArr.length;k++)
    {
      if(tempArr[k]>max){
        max=tempArr[k];
        index=k;
      }
    }
    index++;
    System.out.println("Max Guests were present at :" +index +" Guests Count "+max);
  }
  public static void main(String[] args) {

   int arrl[] = {1, 2, 9, 5, 5};
   int exit[] = {4, 5, 12, 9, 12};
   MaximumIntervalOverlaps maximumIntervalOverlaps=new MaximumIntervalOverlaps();
   maximumIntervalOverlaps.solution(arrl,exit);
  
  }

}
