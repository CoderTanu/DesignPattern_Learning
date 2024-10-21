package AbstractFactoryDesign_Pattern_Solution;

public class LuxuaryFactory implements VechileFactory{

	@Override
	public Vechile getVechile() {
		Vechile vechile= new BMW(); 
		return vechile;
	}

}