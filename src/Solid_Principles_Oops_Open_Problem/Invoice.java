package Solid_Principles_Oops_Open_Problem;


/**
 * single responsibility principle should allow only one change but in above class 3 change will occure so it is not following the principle.
 invoic class getting change due t change in logic of calculator method if we add discount other variable in the class first change
in future we want to save in file than have to change n saveDB method which is second change
 if we change printing logic   which is third change
  */
public class Invoice {
	
	private Marker marker;//has-a
	private int quantity;
	
	public Invoice(Marker marker, int quantity) {
		this.marker= marker;
		this.quantity= quantity;
	}
	
	public int calculateTotal() {
		int price = ((marker.price) * this.quantity);
		return price;
	}
	


}


