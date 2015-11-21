package stack;


public class Stack {
  int top;
  char stack[];
  
  
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

  public Stack(int arraysize) {
    stack = new char[arraysize];
    top = -1;
  }

  public void push(char value) {
    if (top == stack.length - 1) {
      System.out.println("stack is full");
    }
    else {
      top = top + 1;
      stack[top] = value;
    }
  }

  public char pop() {
    if (top == -1) {
      System.out.println("stack is empty");
      return 0;
    }
    else {
      char topElement = stack[top];
      top = top - 1;
      return topElement;
    }
  }

  public void display() {
    for (int i = 0; i <= top; i++ ) {
      System.out.println(stack[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
/*    Stack n = new Stack(5);
    n.push('s');
    n.push('u');
    n.push('m');
    n.push('i');
    n.push('t');

    n.display();
    char element = n.pop();
    System.out.println("element poped out" + element);
    n.display();

    n.pop();
    char element2 = n.pop();
    System.out.println("element poped out" + element2);
    n.display();

    char element3 = n.pop();
    System.out.println("Element poped out" + element3);
    n.display();

    n.pop();
    char element4 = n.pop();
    System.out.println("element poped out" + element4);
    n.display();

    n.pop();
    char element5 = n.pop();
    System.out.println("element popped out" + element5);
    n.display();
    
    Stack s=new Stack(10);*/
    
 //   reverseString("Sumit");
    
  }
  
  
}
