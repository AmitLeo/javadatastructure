package arrays;

import utils.DisplayUtils;
/**
 * Flood fill Algorithm – how to implement fill() in paint?
 * 
 * In MS-Paint, when we take the brush to a pixel and click, the color of the region of that pixel is replaced with a new selected color.
 * Following is the problem statement to do this task. 
 * Given a 2D screen, location of a pixel in the screen and a color, 
 * replace color of the given pixel and all adjacent same colored pixels with the given color.
 * 
 * http://www.geeksforgeeks.org/flood-fill-algorithm-implement-fill-paint/
 * 
 * @author amishash
 *
 */
public class FloodFill {

  public void paint(int arr[][],int brushX,int brushY,int color)
  {
    int currentColor=arr[brushX][brushY];
    int x=brushX;
    int y=brushY;
    System.out.println("Current Color "+currentColor);
    // move left
    while(arr[--x][y]==currentColor)
      arr[x][y]=color; 
    x=brushX;
    //move right
    while(arr[++x][y]==currentColor)
      arr[x][y]=color; 
    x=brushX;
    // move up
    while(arr[x][--y]==currentColor)
      arr[x][y]=color;
    y=brushY;
    //move down
    while(arr[x][++y]==currentColor)
      arr[x][y]=color; 
    arr[brushX][brushY]=color;
  }
  
  

  public static void main(String[] args) {

   int  screen[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 0, 0},
        {1, 0, 0, 1, 1, 0, 1, 1},
        {1, 2, 2, 2, 2, 0, 1, 0},
        {1, 1, 1, 2, 2, 0, 1, 0},
        {1, 1, 1, 2, 2, 2, 2, 0},
        {1, 1, 1, 1, 1, 2, 1, 1},
        {1, 1, 1, 1, 1, 2, 2, 1},
        };
  DisplayUtils.displayTwoDimensionArray(screen);
  FloodFill floodFill=new FloodFill();
  floodFill.paint(screen,4,4,3);
  System.out.println("--------------------");
  DisplayUtils.displayTwoDimensionArray(screen);
  }
}
