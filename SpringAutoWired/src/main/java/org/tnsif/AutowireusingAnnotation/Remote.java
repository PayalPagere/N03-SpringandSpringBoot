package org.tnsif.AutowireusingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {

	private Cell cell;
	@Autowired
	
	@Qualifier("c1")
	public void setCell(Cell cell) {
		this.cell = cell;
	}
	
	public Remote()
	{
		System.out.println("Default Constructor for Remote");
	}
	
	public void remote()
	{
		cell.power();
	}
	
	
	
}
