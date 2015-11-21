package arrays;


/**
 *  Generate all possible sorted arrays from alternate elements of two given sorted arrays
 *  Given two sorted arrays A and B, generate all possible arrays such that first element is taken from A then from B 
 *  then from A and so on in increasing order till the arrays exhausted. The generated arrays should end with an element from B.
 * @author amishash
 */
public class GeneratePossibleSortedArray {

  int arr1[];
  int arr2[];
  
  String sb="";
  public void solution(int argArr1[],int argArr2[])
  {
    this.arr1=argArr1;
    this.arr2=argArr2;
   
    for(int i=0;i<arr1.length;i++)
    {
      recursive(arr1[i]);
    }
  }
  
  
  public void recursive(int argInt)
  {
    
    int temp1=0;
    int temp2=0;
    for(int i=0;i<arr1.length;i++)
    {
      if(argInt<=arr1[i])
      {
        temp1=arr1[i];
        break;
      }
    }

    for(int i=0;i<arr2.length;i++)
    {
      if(temp1<arr2[i])
      {
        temp2=arr2[i];
        break;
      }
    }
    
    if(temp1!=0 && temp2!=0){
      sb=sb+" "+ temp1+ " "+ temp2;
      System.out.println(sb);
      recursive(temp2);
    }else
    {
      sb="";
    }
  }
  
  public static void main(String... s)
  {
    int a[] = {10, 15, 25};
    int b[] = {5, 20, 30};
    GeneratePossibleSortedArray generatePossibleSortedArray=new GeneratePossibleSortedArray();
    generatePossibleSortedArray.solution(a,b);
  }
}
