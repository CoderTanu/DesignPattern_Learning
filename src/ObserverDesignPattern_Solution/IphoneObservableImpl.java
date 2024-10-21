package ObserverDesignPattern_Solution;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl  implements StockObservable{
	
	
	
	List<NotificationAlertObserver> observableList = new ArrayList<>();
	public int stockCount =9;
	
	@Override
	public void add(NotificationAlertObserver observer) {
		observableList.add(observer);
		
	}


	@Override
	public void remove(NotificationAlertObserver observer) {
		observableList.remove(observer);
	}
	
	
	
	
	
	@Override
	public void notifySubscribers() {
		for(NotificationAlertObserver observer : observableList) {
			observer.update();
		}
		
	}

	public void setStockCount(int newStcokCount) {
		if(stockCount == 9) {
			notifySubscribers();
		}
		
		stockCount = stockCount + newStcokCount;
	}

	public int getStockCount() {
		return stockCount;
	}





	
}
