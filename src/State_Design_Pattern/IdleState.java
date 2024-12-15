package State_Design_Pattern;

public class IdleState implements VendingState {

	@Override
	public void insertCoin(VendingMachine product) {
		System.out.println("Coin inserted");
		product.setVendingMachine(new WorkingState());
	}

	@Override
	public void dispenseItem(VendingMachine product) {
		// TODO Auto-generated method stub
		
	}

}
