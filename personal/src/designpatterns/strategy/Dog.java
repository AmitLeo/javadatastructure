package designpatterns.strategy;

public class Dog extends Animal{


  public Dog()
  {
    super();
    setFly(new CantFly());
  }
  
}
