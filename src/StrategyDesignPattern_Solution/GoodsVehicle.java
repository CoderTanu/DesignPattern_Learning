package StrategyDesignPattern_Solution;

public class GoodsVehicle extends Vehicle{

	public GoodsVehicle() {
		super(new NormalDriveStrategy());
	}
}
