package AdapterDsignPattern;

public class ClientMain {

	public static void main(String[] args) {
		WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
		System.out.println(weightMachineAdapter.getWeightInKg());
		
	}

}
