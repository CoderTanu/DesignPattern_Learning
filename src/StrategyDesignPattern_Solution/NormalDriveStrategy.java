package StrategyDesignPattern_Solution;

public class NormalDriveStrategy  implements DriveStrategy{

	@Override
	public void drive() {
		System.out.println("Normal drive strategy");	
	}

}
