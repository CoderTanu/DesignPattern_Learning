package BuilderDesignPattern2;

public class FloodResidentBuilder implements Builder {
	
	private Home floodResistantHome = new Home();
	

	@Override
	public void buildFloor() {
		floodResistantHome.setFloor("10 feets above ground level floor");
	}

	@Override
	public void buildWalls() {
		floodResistantHome.setWalls("Water resistant walls");
		
	}

	@Override
	public void buildTerrace() {
		floodResistantHome.setTerrace("Water leakage resistant terrace");
		
	}

	@Override
	public Home getComplexHomeObject() {
		return this.floodResistantHome;
	}

}
