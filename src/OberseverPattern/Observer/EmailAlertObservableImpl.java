package OberseverPattern.Observer;

import OberseverPattern.Observable.StocksObservable;

public class EmailAlertObservableImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObservableImpl(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"Product is in stock, Hurry Up!");
    }

    public void sendEmail(String emailId, String body){
        System.out.println("mail sent to: "+ emailId);
    }
}
