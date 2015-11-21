import java.util.Stack;



public class PoisonousPlant {
  
  
  private static int getNumberDaysStack(int arr[])
  {
    int days=0;
    
    Stack <Integer>stack1=new <Integer>Stack();
    Stack <Integer>stack2=new <Integer>Stack();

    for(int i =0;i<arr.length;i++)
    {
      stack1.push(arr[i]);
    }

    for(Integer temp:stack1)
    {
      
    }
    return days;
  }
  
  private static int getNumberDays(int arr[])
 {
   int days=0;
  
   boolean plantdied=true;
   while(plantdied)
   {
     int val1=-1;
     plantdied=false;
     for(int i =0;i<arr.length;i++)
     {
       if(arr[i]==-1)
       {
         continue;
       }else if(val1==-1)
       {
         val1=arr[i];
         continue;
       }else
       {
         if(val1<arr[i])
         {
           val1=arr[i];
           arr[i]=-1;
           plantdied=true;
         }else{
           val1=arr[i];
         }
       }
     }
     if(plantdied)
       days++;
   }
   return days;
 }
 
  
  public static void main(String[] args) {

   /* Scanner sc = new Scanner(System.in);
    int arr[]=new int[sc.nextInt()];
    for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();*/
      
      
      System.out.println(getNumberDays(new int[]{5, 4 ,6 ,1, 3, 2}));
  }
}
