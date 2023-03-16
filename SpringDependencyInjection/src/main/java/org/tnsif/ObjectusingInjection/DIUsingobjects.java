package org.tnsif.ObjectusingInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingobjects {
	
public static void main(String[] args) {
		
		ApplicationContext f=new ClassPathXmlApplicationContext("web.xml");
		CellPhone e1=f.getBean("c2",CellPhone.class);
		e1.accept();
		//System.out.println(e);
		//System.out.println(e.cost());
		//System.out.println(e.display());

	}
}
