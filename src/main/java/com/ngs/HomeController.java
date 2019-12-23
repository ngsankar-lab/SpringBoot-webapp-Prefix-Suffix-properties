package com.ngs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(HttpServletRequest req) {
		System.out.println("Inside Home method");
		String name=req.getParameter("name");
		System.out.println("I got data from client that is:"+name);
		
		HttpSession session=req.getSession();
		session.setAttribute("name", name);
		return "Home";
	}

}
