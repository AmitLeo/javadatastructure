package designpatterns.decorator;

public class ToppingDecorator  implements Pizza{

  Pizza pizza;

  public ToppingDecorator(Pizza newPizza)
  {
    this.pizza=newPizza;
  }
  
  public String getDescription() {
    return pizza.getDescription();
  }

  public double getCost() {
    return pizza.getCost();
  }

}
