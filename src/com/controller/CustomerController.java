package com.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import oracle.jdbc.util.Login;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.CustomerVo;
import com.dao.CustomerDao;

@Controller
public class CustomerController 
{
	@RequestMapping("/login.htm")//ModelAttribute mapping the login to the Login.jsp form details.. with object l. we can further pass this login object's  / any string object's value to the next pages.. as specified from spring 2.5
	public String loginValidate(@ModelAttribute("login") CustomerVo l,HttpServletRequest req)
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("MyBean.xml");
			System.out.println("inside login controller");
			CustomerDao d=(CustomerDao)app.getBean("empID"); 
			
			int success=d.registerEmployee(l);
			List<CustomerVo> listRef=d.listOfCustomer();
			
			
			if(!listRef.isEmpty())
			{
			req.setAttribute("ListKey",listRef );
			//System.out.println(l.getEmpCode()+"inside controller");
			
			return "EmplSuccess";
			}
			else
				return "Emplfail";
		}
}
