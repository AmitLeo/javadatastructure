import stack.Stack;


public class StackReverse {

  /**
   * 
   * 1) This method would take a string input and put it's character into the stack.
   * 2) once all the chars are inserted into the stack , it starts poping the charaters from  the stack.
   * Since Stack follows the LIFO strategy so elements would 
   * @param arg
   */
  public static void reverseString(String arg){
    // get the size of string.
    int stackSize=arg.length();
    // as we want to store the character of string into the stack so 
    // the size of stack must be equal to string length;
    Stack s1=new Stack(stackSize);
    // first loop is to push all the elements into the stack .
    for(int i=0;i<arg.length();i++)
    {
      char temp=arg.charAt(i);
      s1.push(temp);
    }
    // next loop is to pop the elements from stack
    for(int i=0;i<arg.length();i++)
    {
      char temp=s1.pop();
      System.out.println(temp);
    }
    
  }

  
  public static void main(String args[])
  {
    
    reverseString("Sumit");
    
    
  }
}
