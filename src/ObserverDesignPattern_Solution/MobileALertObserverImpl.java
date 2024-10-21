package ObserverDesignPattern_Solution;

public class MobileALertObserverImpl  implements NotificationAlertObserver{

	String mobileNo;
    StockObservable observable;
	
	public MobileALertObserverImpl(String mobileNo, StockObservable observable){
		this.observable = observable;
		this.mobileNo = mobileNo;
	}
	
	@Override
	public void update() {
		sendOnMobile("update product detail to"+ mobileNo);
	}

	private void sendOnMobile(String string) {
		System.out.println("sent through mobile no");
	}

}
