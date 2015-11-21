package designpatterns.strategy;

public class Animal {

  private String weight;
  private String name;
  
  
  private Flys fly;
  
  
  /**
   * @return the fly
   */
  public Flys getFly() {
    return fly;
  }
  /**
   * @param fly the fly to set
   */
  public void setFly(Flys fly) {
    this.fly = fly;
  }
  /**
   * @return the weight
   */
  public String getWeight() {
    return weight;
  }
  /**
   * @param weight the weight to set
   */
  public void setWeight(String weight) {
    this.weight = weight;
  }
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  
  public String flyingAbility()
  {
    return fly.fly();
  }
  
  
  
  
  
}
