package designpatterns.observer;

public class StockObserver  implements Observer{

  private double ibmPrice;
  private double googPrice;
  
  public static int totalObservers=0;
  
  private int stockId;
  private Subject stockGrabber;
  
  public StockObserver(Subject stockGrabber){
   this.stockGrabber=stockGrabber;
   totalObservers++;
   this.stockId= totalObservers;
   stockGrabber.register(this);
  }
  
  @Override
  public void update(double ibmPrice, double googPrice) {
    this.ibmPrice=ibmPrice;
    this.googPrice=googPrice;
    print();
  }
  
  public void print()
  {
    System.out.println("Stock Id "+stockId);
    System.out.println("IBM " + ibmPrice);
    System.out.println("Apple " + googPrice);
  }
  

}
