package BuilderDesignPattern2;


//step-4
public class Director {

	private Builder builder;
	
	
	public Director(Builder builderType) {
		this.builder= builderType;
	}


	public Home getComplexObjectOfHome() {
		return this.builder.getComplexHomeObject();
	}
	
	public void manageRequiredHomeConsturction() {
		this.builder.buildFloor();
		this.builder.buildWalls();
		this.builder.buildTerrace();
	}

}
