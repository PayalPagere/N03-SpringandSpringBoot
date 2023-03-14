package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Program to demonstrate on Spring IOC
public class MobileExecuter {

	public static void main(String[] args) {
		/*For airtel object
		Airtel a =new Airtel();
		a.call();
		a.message();
		//for Jio object
		Jio j=new Jio();
		j.call();
		j.message();*/
		
		@SuppressWarnings({ "unused", "resource" })
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		/*Airtel a=(Airtel) c.getBean("airtel");
		Jio a=(Jio) c.getBean("Jio");
		
		a.call();
		a.message();
		
		*/
		
		Sim s=c.getBean("sim",Sim.class);
		s.call();
		s.message();
	}

}

