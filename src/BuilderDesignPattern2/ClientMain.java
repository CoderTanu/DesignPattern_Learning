package BuilderDesignPattern2;


public class ClientMain {

	public static void main(String[] args) {
		
		
    EarthQuakeResidentBuilder eqbuilder  = new EarthQuakeResidentBuilder();	
	Director directorObj1 = new Director(eqbuilder);
	directorObj1.manageRequiredHomeConsturction();
	
	Home homeAEnd = directorObj1.getComplexObjectOfHome();
	
	
	System.out.println(homeAEnd);
	System.out.println(homeAEnd.getFloor() +  homeAEnd.getTerrace() + homeAEnd.getWalls());
	
	}

}
