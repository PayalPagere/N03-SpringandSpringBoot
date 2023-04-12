package org.tnsif.springweb;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * it wraps 3 used annotations
 * @Configration: spring configuration class is used instead XML to define the components
 * @Enable AutoConfiguration:is a Spring boot specific annotation
 * @Component: it Automatically detect our custom beans,it denote that a class is a component
 * */
@SpringBootApplication
public class SpringwebApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringwebApplication.class, args);
		Scanner sc=new Scanner(System.in);
		/*int x=sc.nextInt();
		System.out.println(x);
		Employe e=context.getBean(Employe.class);
		e.setEmpid(10123);
		e.setEmpname("Payal Pagere");
		e.print();*/
		HomeController h=context.getBean(HomeController.class);
		h.home();
		
	}

}
