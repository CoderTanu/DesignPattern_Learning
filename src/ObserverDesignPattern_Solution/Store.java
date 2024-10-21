package ObserverDesignPattern_Solution;

public class Store {

	public static void main(String[] args) {
		StockObservable iphoneStockObservable = new IphoneObservableImpl();
		
		
		NotificationAlertObserver observer1 = new EmailAlertObserverImpl("dfgch@gmail.com", iphoneStockObservable );
		NotificationAlertObserver observer2 = new EmailAlertObserverImpl("djvbh@gmail.com",iphoneStockObservable);
		NotificationAlertObserver observer3 = new MobileALertObserverImpl("5634326346", iphoneStockObservable);
		
		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);
		
		iphoneStockObservable.setStockCount(20);
	}

}
