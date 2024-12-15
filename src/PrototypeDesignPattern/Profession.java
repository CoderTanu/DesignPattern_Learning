package PrototypeDesignPattern;

public abstract  class Profession  implements Cloneable{
	
	private String name;
	
	private int id;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	abstract void print();
	
	public Object cloningMethod() {
		Object clone = null;
		
		try {
			clone = super.clone();
		}catch(CloneNotSupportedException cex) {
			cex.printStackTrace();
		}
		
		return clone;
	}
	
	
	

}
