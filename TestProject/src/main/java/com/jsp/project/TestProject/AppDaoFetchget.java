package com.jsp.project.TestProject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class AppDaoFetchget 
{
    public static void main( String[] args )
    {    	
    	//jdbc connection
    	Configuration c = new Configuration();
    	c.configure("hibernate.cfg.xml");
    	SessionFactory bsf = c.buildSessionFactory();    	
    	Session os = bsf.openSession();
    	Employee e = os.get(Employee.class, 1);
    	System.out.println("...............");
    	System.out.println(e);
    	
    	Employee e1 = os.get(Employee.class, 2);
    	System.out.println("...............");
    	System.out.println(e1);
    	
    	Employee e2 = os.get(Employee.class, 7);
    	System.out.println("...............");
    	System.out.println(e2);
    	
    	
    	os.close();
    	bsf.close();
    	
    	
    }
}
