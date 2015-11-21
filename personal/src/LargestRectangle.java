import java.util.Scanner;


public class LargestRectangle {

  
  private static int largestRectangle(int arr[])
  {
   int max_area=0;
   for(int i =0;i<arr.length;i++)
   {
     int temp_max=0;
     int buildings;
     int smallestElem=-1;
     for(int j=i;j>=0;j--)
     {
       buildings=(i-j)+1;
       if(smallestElem==-1 || smallestElem>arr[j])
       {
         smallestElem=arr[j];
       }
       if(temp_max<smallestElem*buildings)
       {
         temp_max=smallestElem*buildings;
       }
     }
     if(max_area<temp_max)
       max_area=temp_max;
   }
   return max_area;
  }
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int arr[]=new int[sc.nextInt()];
    for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
      
      
      System.out.println(largestRectangle(new int[]{1,2,3,4,5}));
  }
}
