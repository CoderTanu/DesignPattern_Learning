package State_Design_Pattern;

public interface VendingState {
	
	void insertCoin(VendingMachine product);
	
	void dispenseItem(VendingMachine product);

}
