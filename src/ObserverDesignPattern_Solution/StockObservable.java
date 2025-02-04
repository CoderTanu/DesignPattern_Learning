package ObserverDesignPattern_Solution;

public interface StockObservable {
	
	public void add(NotificationAlertObserver observer);
	
	public void remove(NotificationAlertObserver observer);
	
	public void notifySubscribers();
	
	public void setStockCount(int newStcokCount);
	
	public int getStockCount();

}
