package designpatterns.decorator;

public class TomatoSause extends ToppingDecorator{

  public TomatoSause(Pizza newPizza) {
    super(newPizza);
  }
  
  public String getDescription() {
    return pizza.getDescription()+" Tomato Suase";
  }

  public double getCost() {
    return pizza.getCost()+3;
  }

}

