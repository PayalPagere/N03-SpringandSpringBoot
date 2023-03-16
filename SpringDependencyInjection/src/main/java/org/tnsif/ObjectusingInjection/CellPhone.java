package org.tnsif.ObjectusingInjection;
//DI in the form of Objects
public class CellPhone {
	
	//Di in form of Objects
	Charger charger;

	//DI using setters
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	//Injecting the object of charger class
	public void accept()
	{
		charger.power();
	}
	 
	
}
