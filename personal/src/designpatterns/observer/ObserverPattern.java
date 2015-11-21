package designpatterns.observer;

public class ObserverPattern {

  public static void main(String[] args) {
    StockGrabber stockGrabber=new StockGrabber();
    Observer one=new StockObserver(stockGrabber);
    
    stockGrabber.setIbmPrice(343);
    stockGrabber.setGoogPrice(454);
    
  }
  
  

}
