package org.tnsif.autowiredexample;

public class Laptop {
	
	Processor p;

	/*public void setP(Processor p) {
		this.p = p;
	}*/
	
	
	


	public Laptop(Processor p) {
		super();
		System.out.println("Auto Wire using Constructor");
		this.p = p;
	}





	public void accept()
	{
		p.speed();
	}
}
