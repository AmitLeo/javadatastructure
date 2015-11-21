package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber  implements Subject{

  List <Observer>arrayList;
  private double ibmPrice;
  private double googPrice;
  
  public StockGrabber()  {
    arrayList=new ArrayList<Observer>();
  }
  
  @Override
  public void register(Observer newObserver) {
    arrayList.add(newObserver);
  }

  @Override
  public void unRegister(Observer deleteObserver) {
    arrayList.remove(arrayList.indexOf(deleteObserver));
  }

  @Override
  public void notifyObservers() {
    for(Observer  observer:arrayList)
      observer.update(ibmPrice,googPrice);
  }


  /**
   * @param ibmPrice the ibmPrice to set
   */
  public void setIbmPrice(double ibmPrice) {
    this.ibmPrice = ibmPrice;
    notifyObservers();
  }


  /**
   * @param googPrice the googPrice to set
   */
  public void setGoogPrice(double googPrice) {
    this.googPrice = googPrice;
    notifyObservers();
  }

  
  
  
}
