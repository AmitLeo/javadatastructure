package arrays;
/**
 * Count frequencies of all elements in array in O(1) extra space and O(n) time
 * 
 * Given an unsorted array of n integers which can contain integers from 1 to n. 
 * Some elements can be repeated multiple times and some other elements can be absent from the array.
 * Count frequency of all elements that are present and print the missing elements.
 * @author amishash
 */
public class CountFrequency {
  
  //{1, 2, 1, 3, 4, 2, 3};
  public void solution2(int argArr[])
  {
    for(int i=0;i<argArr.length;i++)
    {
      if(argArr[i]<=0)
        continue;
      int temp=argArr[i];
      while(temp!=0)
      {
        if(temp <0)
          break;
       if(argArr[temp-1]>=0)
        {
         if(i==temp-1)
         {
           argArr[i]=-1;
           temp=0;
         }else
         {
           argArr[i]=argArr[temp-1];
           argArr[temp-1]=-1;
           temp= argArr[i];
         }
        }else
        {
          argArr[temp-1] =argArr[temp-1]-1;
          temp=0;
          argArr[i]=0;
        } 
        if(i==argArr.length-1)
          break;
      }
    }

  }  
  public void solution(int argArr[])
  {
    for(int i=0;i<argArr.length;i++)
    {
      if(argArr[i]<=0)
        continue;
      while(argArr[i]!=0  )
      {
        int temp=argArr[argArr[i]-1];
        if(argArr[argArr[i]-1]>=0)
        {
          argArr[argArr[i]-1]=-1;
          argArr[i]=temp;
        }else
        {
          argArr[argArr[i]-1]=argArr[argArr[i]-1]-1;
          argArr[i]=0;
        } 
        if(i==argArr.length-1)
          break;
      }
    }
  }
  
  public void displayFrequencyCount(int argArr[]) {
    for (int i = 0; i < argArr.length; i++ ) {
      System.out.println("Index :"+ i +" occurred "+Math.abs(argArr[i]) +" times");
    }
    System.out.println("-----------------------");
  }

  public static void main(String[] args) {

    int[] arrTest1=new int[] {2, 3, 3, 2, 5};
    int[] arrTest2=new int[] {4, 4, 4, 4};
    int[] arrTest3=new int[] {1, 2, 1, 3, 4, 2, 3};
    
    CountFrequency countFrequency=new CountFrequency();
    countFrequency.solution2(arrTest1);
    countFrequency.displayFrequencyCount(arrTest1);
    countFrequency.solution2(arrTest2);
    countFrequency.displayFrequencyCount(arrTest2);
    countFrequency.solution2(arrTest3);
    countFrequency.displayFrequencyCount(arrTest3);
  }

}
