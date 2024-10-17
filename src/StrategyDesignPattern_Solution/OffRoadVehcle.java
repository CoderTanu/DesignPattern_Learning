package StrategyDesignPattern_Solution;

public class OffRoadVehcle  extends Vehicle{
	

	public OffRoadVehcle() {
		super(new SportDriveStrategy());
	}
}
