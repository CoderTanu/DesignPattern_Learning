package StrategyDesignPattern_Solution;

public class SportVehicle extends Vehicle{
	
	public SportVehicle() {
		super(new SportDriveStrategy());
	}

}
