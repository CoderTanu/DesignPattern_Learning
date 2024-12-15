package State_Design_Pattern;

public class VendingMachine {
	
	VendingState machineState;
	
	public VendingState getVendingMachine() {
		return machineState;
	}
	
	public void setVendingMachine(VendingState machineState) {
		this.machineState = machineState;
	}

}
