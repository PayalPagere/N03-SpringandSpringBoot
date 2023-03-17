package org.tnsif.AutowireusingAnnotation;

public class Cell {

	//private DM
	private String company;
	private String size;
	//getters and setters
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Cell() {
		super();
		System.out.println("Default constructor for Cell");
		// TODO Auto-generated constructor stub
	}
	public void power()

	{
		System.out.println("Company of a cell:"+company);
		System.out.println("Size of a cell:"+size);
	}
	
	
	
	
}
