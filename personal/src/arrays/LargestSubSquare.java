package arrays;

import utils.DisplayUtils;

/**
 * Given a matrix of ‘O’ and ‘X’, find the largest subsquare surrounded by ‘X’
 * Given a matrix where every element is either ‘O’ or ‘X’, find the largest subsquare surrounded by ‘X’.
 * In the below article, it is assumed that the given matrix is also square matrix. 
 * The code given below can be easily extended for rectangular matrices.
 * 
 * @author amishash
 *
 */
public class LargestSubSquare {
  
  public void largeSubSquare(int argArr[][])
  {
    int verArr[][]=new int[argArr.length][argArr.length];
    int horArr[][]=new int[argArr.length][argArr.length];
    for(int i=0;i<argArr.length;i++)
    {
      int counter=0;
      for(int j=0;j<argArr.length;j++)
      {
        if(argArr[i][j]=='X')
        {
          counter++;
          horArr[i][j]=counter;
        }else
        {
          horArr[i][j]=0;
        }
      }
    }
      
      for(int i=0;i<argArr.length;i++)
      {
        int counter=0;
        for(int j=0;j<argArr.length;j++)
        {
          if(argArr[j][i]=='X')
          {
            counter++;
            verArr[j][i]=counter;
          }else
          {
            verArr[j][i]=0;
          }
        }
    }
    
      System.out.println("Horizontal Array");
      DisplayUtils.displayTwoDimensionArray(horArr);
      System.out.println("Vertical Array");
      DisplayUtils.displayTwoDimensionArray(verArr);
      this.findlargestSubSquare(verArr,horArr,argArr);
  }

  public void findlargestSubSquare(int[][] verArr,int[][] horArr,int actualArr[][]){
    
    int max=0;
    for(int i=verArr.length-1;i>=0;i--)
    {
      for(int j=verArr.length-1;j>=0;j--)
      {
        int square=0;
        if(verArr[i][j]>horArr[i][j])
          square=horArr[i][j];
        else
          square=verArr[i][j];

        if(square>max) {

          int startingX=i-square+1;
          int startingY=j-square+1;
        while(actualArr[startingX][(j+1)-square]=='X' && startingX<i)
          startingX++; 
        while(actualArr[(i+1)-square][startingY]=='X' && startingY<j)
          startingY++; 

        if(startingX==i && startingY==j)
          max=square;
     
        }
      }
    }
    System.out.println(max);
    
    
  }
  
  public static void main(String[] args) {
    int square[][] = { {'X', 'O', 'X', 'X', 'X'},
      {'X', 'X', 'X', 'X', 'X'},
      {'X', 'X', 'O', 'X', 'O'},
      {'X', 'X', 'X', 'X', 'X'},
      {'X', 'X', 'X', 'O', 'O'},
     };
    
    int square2[][]= { {'X', 'O', 'X', 'X', 'X', 'X'},
        {'X', 'O', 'X', 'X', 'X', 'X'},
        {'X', 'X', 'X', 'O', 'O', 'X'},
        {'X', 'X', 'X', 'X', 'X', 'X'},
        {'X', 'X', 'X', 'O', 'X', 'O'},
       };
    DisplayUtils.displayTwoDimensionArray(square);
    
    new LargestSubSquare().largeSubSquare(square);
  }
  
}
