package BuilderDesignPattern2;

public class Home {
	
	private String floor;
	private String walls;
	private String terrace;
	
	public Home() {
		
	}
	
	
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getWalls() {
		return walls;
	}
	public void setWalls(String walls) {
		this.walls = walls;
	}
	public String getTerrace() {
		return terrace;
	}
	public void setTerrace(String terrace) {
		this.terrace = terrace;
	}
	
	public Home(String floor, String walls, String terrace) {
		this.floor = floor;
		this.walls = walls;
		this.terrace = terrace;
	}
	
	
	

}
