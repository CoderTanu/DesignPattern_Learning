package AbstractFactoryDesign_Pattern_Solution;

public class MainAbstractFactory {

	public static void main(String[] args) {
		VechileFactory2 VechileFactory2 = new VechileFactory2();
		VechileFactory v =VechileFactory2.getVechileFactory("LUXUARY");
		v.getVechile().average();;
		
		VechileFactory2 VechileFactory21 = new VechileFactory2();
		VechileFactory v1=VechileFactory21.getVechileFactory("ODINARY");
		v1.getVechile().average();;
	}

}
