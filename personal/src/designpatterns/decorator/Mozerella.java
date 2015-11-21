package designpatterns.decorator;

public class Mozerella extends ToppingDecorator{

  public Mozerella(Pizza newPizza) {
    super(newPizza);
  }
  
  public String getDescription() {
    return pizza.getDescription()+" moz";
  }

  public double getCost() {
    return pizza.getCost()+3;
  }

}
