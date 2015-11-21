package designpatterns.strategy;

public interface Flys {
  
  public String fly();
}


class CanFly implements Flys
{
  public String fly() {
   return "Can Fly";
  }
}

class CantFly implements Flys
{
  
  public String fly() {
    return "Cant Fly";
  }
  
}