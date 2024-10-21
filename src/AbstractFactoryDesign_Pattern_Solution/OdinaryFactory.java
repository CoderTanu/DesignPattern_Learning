package AbstractFactoryDesign_Pattern_Solution;

public class OdinaryFactory implements VechileFactory{

	@Override
	public Vechile getVechile() {
		Vechile vechile= new Hundai(); 
		return vechile;
	}

}