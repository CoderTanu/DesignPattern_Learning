package ObserverDesignPattern_Solution;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
	
	String emailId;
	StockObservable observable;
	
	public EmailAlertObserverImpl(String emailId, StockObservable observable ){
		this.observable = observable;
		this.emailId = emailId;
	}

	@Override
	public void update() {
		send("update product detail to" + emailId  );
	}

	private void send(String string) {
		System.out.println("email sent");
	}

}
