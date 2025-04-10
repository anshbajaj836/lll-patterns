package OberseverPattern.Observer;

import OberseverPattern.Observable.StocksObservable;

public class MobileAlertObservableImpl implements NotificationAlertObserver {


    String emailId;
    StocksObservable observable;

    public MobileAlertObservableImpl(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendNotification(emailId,"Product is in stock, Hurry Up!");
    }

    public void sendNotification(String emailId, String body){
        System.out.println("mail sent to: "+ emailId);
    }



}
