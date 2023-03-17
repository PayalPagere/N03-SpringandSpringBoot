package org.tnsif.AutowireusingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executer {
	public static void main(String args[]) {

	ApplicationContext c=new ClassPathXmlApplicationContext("web.xml");
	Remote r=c.getBean("remote",Remote.class);
	r.remote();
}}
