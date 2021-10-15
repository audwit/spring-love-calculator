package com.seleniumexpress.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Inside onStartup method");
		
		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		webApplicationContext.setConfigLocation("classpath:ApplicationConfig.xml");
		
		DispatcherServlet dispatherServlet = new DispatcherServlet();
		//Register dispatcher servlet with servlet context
		servletContext.addServlet("myDispatcherServlet", dispatherServlet);
	}

}
