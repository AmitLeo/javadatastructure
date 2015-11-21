package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class BalancedParanthesis {

   Map <Character,Character>_map;
   
   public BalancedParanthesis()
   {

     _map=new HashMap<Character,Character>();
     _map.put('(',')');
     _map.put('{','}');
     _map.put('[',']');
   }
   
  public boolean isBalancedString(String args)
  {
    Stack stack=new Stack();
    for(int i =0;i<args.length();i++)
    {
      Character temp=_map.get(args.charAt(i));
      
      if(null!=temp)
      {
        stack.push(args.charAt(i));
        
      }else if(stack.size()>0&&args.charAt(i)==_map.get((char)stack.pop()))
        {
          continue;
        }else
        {
          return false;
        }
    }
    if(stack.size()==0)
      return true;
      else
      return false;
  }
  
  
  public static void main(String args[])
  {
    BalancedParanthesis balParanthesis=new BalancedParanthesis();
    System.out.println(balParanthesis.isBalancedString("{}()"));
    
    
  }
}
