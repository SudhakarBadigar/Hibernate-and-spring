package com.jsp.project.TestProject;

import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class AppDao 
{
	
	
    public static void main( String[] args )
    {
    	Configuration c = new Configuration();
    	c.configure("hibernate.cfg.xml");
    }
}