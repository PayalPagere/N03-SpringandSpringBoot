package org.tnsif.springweb;

import org.springframework.stereotype.Component;
//it allows spring autodetect the custom beans without any Explicit code
@Component
public class Employe {

	//Private data members
	private int empid;
	private String empname;
	
	//Getters and Setters
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public void print()
	{
		System.out.println("Employees belong to IT Department");
		System.out.println("Employee ID: "+empid+" "+"Employee Name:"+empname);
	}
	
	
	
}
