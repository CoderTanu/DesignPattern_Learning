package StrategyDesignPattern_Solution;

public class PassengerVehicle extends Vehicle {

	public PassengerVehicle() {
		super(new SportDriveStrategy());
	}

	

}
