package StrategyDesignPattern_Solution;

public class Vehicle {
	
	DriveStrategy driveStrategyObject;
	
	public Vehicle(DriveStrategy driveStrategyObject) {
		this.driveStrategyObject =driveStrategyObject;
	}
	
	public void drive() {
		driveStrategyObject.drive();
	}

}
