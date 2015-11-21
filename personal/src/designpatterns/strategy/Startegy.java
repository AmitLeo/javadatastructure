package designpatterns.strategy;

public class Startegy {

  public static void main(String[] args) {
    Animal dog=new Dog();
    Animal bird=new Bird();
    
    System.out.println("Dog "+dog.flyingAbility());

    System.out.println("Bird" +bird.flyingAbility());
  }

}
