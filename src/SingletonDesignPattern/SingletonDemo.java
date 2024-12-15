package SingletonDesignPattern;

public class SingletonDemo {
	
	private  static SingletonDemo new_instance ;
	
   private SingletonDemo() {
	   System.out.println("inside SingletonDemo constructor!!!!");
   }
   
   
   public static SingletonDemo getInstance() {
	   
	   if(new_instance == null) {
		   
		   new_instance = new SingletonDemo();
		   
	   }
	   
	   return new_instance;
	   
   }

	public static void main(String[] args) {
		SingletonDemo stv = SingletonDemo.getInstance();
		System.out.println(stv.hashCode());
		
		SingletonDemo stv1 = SingletonDemo.getInstance();
		System.out.println(stv1.hashCode());

	}

}
