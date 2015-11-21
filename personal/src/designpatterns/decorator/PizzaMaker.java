package designpatterns.decorator;

public class PizzaMaker {

  
  public static void main(String[] args) {

    Pizza pizza=new Mozerella(new TomatoSause(new PlainPizza()));
    System.out.println(pizza.getDescription());
    System.out.println(pizza.getCost());
    
  }

}
