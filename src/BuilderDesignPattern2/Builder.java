package BuilderDesignPattern2;



//Step--2
public interface Builder {
	
	public void buildFloor();
	
	public void buildWalls();
	
	public void buildTerrace();
	
	public Home getComplexHomeObject();
	

}
