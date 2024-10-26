package AdapterDsignPattern;


public class WeightMachineAdapterImpl implements WeightMachineAdapter {

	
	WeightMachine weightMachine;
	
	public WeightMachineAdapterImpl(WeightMachine weightMachine) {
	  this.weightMachine = weightMachine;
	}
	
	@Override
	public double getWeightInKg() {
		double weightInPound = weightMachine.getWeightInPound();
		
		//convert pound int kg
		double weightInKg = weightInPound * .45;
		return weightInKg;
	}

}
