package designpatterns.strategy;

public class Bird extends Animal{
  public  Bird()
  {
    super();
    setFly(new CantFly());
  }
}
