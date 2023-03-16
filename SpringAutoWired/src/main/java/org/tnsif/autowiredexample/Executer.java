package org.tnsif.autowiredexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executer {
	
	public static void main(String args[])
	{
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Laptop l=c.getBean("laptop",Laptop.class);
		l.accept();
	}
}
