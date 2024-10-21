package DecoratorDesignPattern_Solution;

public class MainPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mangharita + extracheese
		
		BasePizza pizza1 = new ExtraCheese(new Margherita());
		
		BasePizza pizza2 = new Mushroom(new ExtraCheese(new Margherita()));
		
		System.out.println(pizza1.cost());
		System.out.println(pizza2.cost());
		

	}

}
