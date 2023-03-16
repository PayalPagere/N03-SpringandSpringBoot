package org.tnsif.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingCollection {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		ApplicationContext c=new ClassPathXmlApplicationContext("collect.xml");
		//Collection object and calling collection demo class
		CollectionDemo d=c.getBean("collection",CollectionDemo.class);
		//Displaying the display method ie,list of contact and set of books
		d.display();
		
	}
}
