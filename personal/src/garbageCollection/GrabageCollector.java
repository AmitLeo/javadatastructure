package garbageCollection;

import java.util.ArrayList;

public class GrabageCollector {
  
  
  public void show()
  {
    while(true)
      new ArrayList(1000);
  }
  

  public static void main(String[] args) {
    GrabageCollector rabageCollector=new GrabageCollector();
    
  }

}
