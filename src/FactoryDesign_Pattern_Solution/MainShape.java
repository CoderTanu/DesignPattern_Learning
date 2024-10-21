package FactoryDesign_Pattern_Solution;

public class MainShape {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		  Shape v=shapeFactory.getShape("CIRCLE");
		   v.draw();
		   Shape v1=shapeFactory.getShape("RECTANGLE");
		   v1.draw();
		   Shape v3=shapeFactory.getShape(null);
		   v3.draw();
	}

}
