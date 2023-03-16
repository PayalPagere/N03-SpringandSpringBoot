package org.tnsif.autowiredexample;

public class Laptop {
	
	Processor p;

	public void setP(Processor p) {
		this.p = p;
	}
	
	public void accept()
	{
		p.speed();
	}
}
