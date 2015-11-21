package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Count distinct elements in every window of size k
 * 
 * http://www.geeksforgeeks.org/count-distinct-elements-in-every-window-of-size-k/
 * 
 * @author amishash
 *
 */
public class CountDistinctElemWindow {

  public void solution(int argArr[], int argWindow)
  {
    Map <Integer, Integer>map=new HashMap<Integer, Integer>();
    int window=0;
    for(int i=0;i<argArr.length;i++)
    {
      window++;
      Integer temp=map.get(argArr[i]);
      if(null==temp)
        map.put(argArr[i],1);
      else
        map.put(argArr[i],++temp);
      if(argWindow==window )
      {
        System.out.println(map.size());
        Integer tempInt=map.get(argArr[(i+1)-argWindow]);
        if(tempInt==1)
          map.remove(argArr[(i+1)-argWindow]);
        else
          map.put(argArr[(i+1)-argWindow],--tempInt);
        window--;
      }
    }
  }
  
  public static void main(String[] args) {
    CountDistinctElemWindow countDistinctElemWindow=new CountDistinctElemWindow();
    countDistinctElemWindow.solution(new int[] {1, 2, 1, 3, 4, 2, 3}, 4);
  }

}
