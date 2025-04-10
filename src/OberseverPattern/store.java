package OberseverPattern;

import OberseverPattern.Observable.IphoneObservableImpl;
import OberseverPattern.Observable.StocksObservable;
import OberseverPattern.Observer.EmailAlertObservableImpl;
import OberseverPattern.Observer.MobileAlertObservableImpl;
import OberseverPattern.Observer.NotificationAlertObserver;

public class store {


    public static void main(String args[]){


        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObservableImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObservableImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObservableImpl("xyz@gmail.com", iphoneStockObservable);


        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);


    }


}
