package BuilderDesignPattern2;


//step--3
public class EarthQuakeResidentBuilder  implements Builder {
	
	private Home earthQuakeResistantHome= new Home();

	@Override
	public void buildFloor() {
		this.earthQuakeResistantHome.setFloor("WoodenFloor");
		
	}

	@Override
	public void buildWalls() {
		this.earthQuakeResistantHome.setWalls("Wooden wall");
		
	}

	@Override
	public void buildTerrace() {
		this.earthQuakeResistantHome.setTerrace("Wooden terrace");
		
	}

	@Override
	public Home getComplexHomeObject() {
		return this.earthQuakeResistantHome;
	}

}
