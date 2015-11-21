package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author amishash
 *
 */
public class SumEvenOddOne {
  
  public void solution(int argLength)
  {
      List <Integer> numbers=new ArrayList<Integer>();
      for(int i=0;i<argLength;i++)
      {
        if(numbers.size()==0)
        {
          for(int j=1;j<10;j++)
            numbers.add(j);
        }else
        {
          List tobeadded=new ArrayList();
          for(int temp:numbers)
          {
            if(i!=argLength-1)
            {
              for(int k=temp%10-1;k<9;k++)
              {
                tobeadded.add(Integer.parseInt(temp+""+k));
              }
            }else
            {
              int last=temp%10;
              int secondlast=temp/10;
              int append=  secondlast-last+1;
              if(append<0)
                append=last;
              if(  append==0)
                append=0;
              tobeadded.add(Integer.parseInt(temp+""+append));
            }
          }
          numbers.clear();
          numbers.addAll(tobeadded);
        }
      }
      System.out.println(Arrays.toString(numbers.toArray()));
  }
  public static void main (String args[]){
    
    SumEvenOddOne sumEvenOddOne=new SumEvenOddOne();
    sumEvenOddOne.solution(2);
    sumEvenOddOne.solution(3);
  }

}
