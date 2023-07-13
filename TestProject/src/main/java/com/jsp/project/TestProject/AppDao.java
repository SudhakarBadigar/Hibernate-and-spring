package com.jsp.project.TestProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class AppDao 
{
	
	
    public static void main( String[] args )
    {
//    	Student st = new Student();
//    	st.setUsn(11);
//    	st.setName("RamaKrishna");
//    	st.setMarks(99.99);
    	
    	
    	Employee emp = new Employee();
    	emp.setName("harris");
    	emp.setSalary(45.3);
    	emp.setX(176);
    	
    	
    	
    	//jdbc connection
    	Configuration c = new Configuration();
    	c.configure("hibernate.cfg.xml");
    	SessionFactory bsf = c.buildSessionFactory();
    	
    	Session os = bsf.openSession();
    	Transaction tx = os.beginTransaction();
    	os.save(emp);
    	tx.commit();
    	os.close();
    	bsf.close();
    	
    	
    }
}
