package State_Design_Pattern;

public class WorkingState implements VendingState{

	@Override
	public void insertCoin(VendingMachine product) {
		
	}

	@Override
	public void dispenseItem(VendingMachine product) {
	System.out.println("inside dispenseItem of workingState ");
	}

}
