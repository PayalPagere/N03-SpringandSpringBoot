package org.tnsif.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//to connect to http server
@Controller
public class HomeController {
	//send request to server for http server to return JSP file 
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Code to demonstrate on Simple "+"web Application");
		return "home.jsp";
	}
}
