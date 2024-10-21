package AbstractFactoryDesign_Pattern_Solution;


public class VechileFactory2 {

	
	public VechileFactory getVechileFactory(String input) {
		switch(input) {
		case "ODINARY" : 
			return new OdinaryFactory();
		case "LUXUARY" :
				return new LuxuaryFactory();
		default :
			return null;
		
		}
	}
}
