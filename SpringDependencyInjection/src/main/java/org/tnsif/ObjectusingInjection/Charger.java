package org.tnsif.ObjectusingInjection;

public class Charger {
	
	//private data member
	private String brand;
	private int voltage;
	private String type;
	
	// DI Using setters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void power()
	{
		System.out.println("Details related to charger:");
		System.out.println("charger Brand" + brand + "voltage" + voltage + "typ[e" + type);
	}

	
	
}