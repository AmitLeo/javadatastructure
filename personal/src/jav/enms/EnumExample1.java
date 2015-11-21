package jav.enms;

enum Season{   
WINTER(5), SPRING(10), SUMMER(15), FALL(20);
private int value;  
private Season(int value){  
  this.value=value;  
}  
public int getValue(){
  return value;
}
}  

public class EnumExample1 {
  public static void main(String[] args) {
  for (Season s : Season.values())  {
    System.out.println(s +" "+ s.getValue());  
    s.getValue();
  }
    System.out.println(Season.valueOf("SUMMER"));

  }
}
