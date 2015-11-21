package utils;

public class DisplayUtils {

  
  public static void displayTwoDimensionArray(int argArr[][])
  {
    for(int i=0;i<argArr.length;i++)
    {
      for(int j=0;j<argArr[i].length;j++)
      {
        System.out.print(argArr[i][j]+"   ");
      }
      System.out.println();
    }
  }
}
